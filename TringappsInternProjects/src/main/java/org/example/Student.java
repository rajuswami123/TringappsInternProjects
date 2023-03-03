package org.example;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


class Students
{
    String name;
    char grade;
    float gpa;

    Students
            (String name, char grade, float gpa) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }

    float ugpa(String ugrade) {
            if (ugrade.equals("A+")) return 4.3F;
            else if (ugrade.equals("A")) return 4.0F;
            else if (ugrade.equals("B+")) return 3.3F;

            else if (ugrade.equals("B")) return 3.0F;
            else if (ugrade.equals("C+")) return 2.3F;

            else if (ugrade.equals("C")) return 2.0F;
            else if (ugrade.equals("D+")) return 1.3F;
            else if (ugrade.equals("D")) return 1.0F;
            else return 0;

        }
    String msg(String name, float x) {
        return (name + " has a" + x + " gpa");
    }
    public static void assingment_3() {
        Logger logger=Logger.getLogger("com.api.jar");
        logger.log(Level.INFO, () ->"Enter the student name :");
        Scanner in =new Scanner(System.in);
        String name=in.next();
        logger.log(Level.INFO, () ->"Enter students grade :");
        char grade=in.next().charAt(0);
        logger.log(Level.INFO, () ->"Enter your previous gpa");
        float gpa=in.nextFloat();
        Students
                ob=new Students
                (name,grade,gpa);
        logger.log(Level.INFO, () ->"Enter your current Grade :");
        String cgrade=in.next();
        logger.log(Level.INFO, () ->ob.msg(name, ob.ugpa(cgrade)));
    }
}
