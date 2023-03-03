package org.example;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class BasicShape {
    String shapeName;
    float side;
    float side2;
    float side3;
    String s1 = "circle";
    String s2 = "rectangle";
    String s3 = "triangle";

    BasicShape(String shapeName, float side) {
        this.shapeName = shapeName;
        this.side = side;

    }

    BasicShape(String shapeName, float side2, float side3) {
        this.shapeName = shapeName;
        this.side2 = side2;
        this.side3 = side3;
    }

    BasicShape(String shapeName, float side, float side2, float side3) {
        this.side = side;
        this.shapeName = shapeName;
        this.side2 = side2;
        this.side3 = side3;

    }


    float peri() {
        if (shapeName.equals(s3)) {
            return side + side2 + side3;
        }
        if (shapeName.equals(s2)) {
            return 2 * (side2 + side3);
        }
        if (shapeName.equals(s1)) {
            return 2 * 3.14f * side;
        }
        return 0;


    }

    float area() {
        if (shapeName.equals(s3)) {
            return 0.5f * side2 * side3;
        }
        if (shapeName.equals(s1)) {
            return 3.14f * side * side;
        }
        if (shapeName.equals(s2)) {
            return side2 * side3;
        }

        return 0;
    }
    public static void basicShape() {
        Logger ou = Logger.getLogger("com.api.jar");
        Scanner in =new Scanner(System.in);
        float radi;
        float side;
        float side2 ;
        float side1;
        ou.info("1)Triangle\n2)Rectangle\n3)circle");
      ou.info("Enter the shapeName :");
        String name=in.next();
        ou.info("Enter the Dimensions : ");

        if(name.equals("circle")) {
            ou.info("Radius :");
            radi=in.nextFloat();


            BasicShape ob= new BasicShape(name,radi);
            ou.info("The perimetre of circle is :");
            ou.log(Level.INFO, () ->""+ ob.peri());
            ou.info("The  Area of Circle  is :");
            ou.log(Level.INFO, () ->""+ ob.area());

        }
        if(name.equals("triangle")){
            ou.info("Enter side 1:");
             side=in.nextFloat();
            ou.info("Enter side 2:");
             side1=in.nextFloat();
            ou.info(("Enter side 3:"));
             side2=in.nextFloat();
            BasicShape ob= new BasicShape(name,side,side1,side2);
            ou.info("The perimetre of Triangle is :");
            ou.log(Level.INFO, () ->""+ob.peri());
            ou.info("The area of triangle is :");
            ou.log(Level.INFO, () ->""+ ob.area());
        }

        if(name.equals("rectangle")){
            ou.info(("Enter length :"));
             side1=in.nextFloat();
            ou.info(("Enter  Breath :"));
            side2=in.nextFloat();
            BasicShape ob= new BasicShape(name,side1,side2);
            ou.info("The perimetre of Rectangle is :");
            ou.log(Level.INFO, () ->""+ob.peri());
            ou.info("The area of the Rectangle is :");
            ou.log(Level.INFO, () ->""+ ob.area());
        }
    }


}
