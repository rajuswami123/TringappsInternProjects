package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataSturcturesSO {
    public static void main(String[]args) {
        Logger ou = Logger.getLogger("com.api.jar");
        //printing elements
        int i=0;
        Scanner in=new Scanner(System.in);
        ou.info("Enter the any 3 elements :");
        int []a=new int[3];
        a[0]=in.nextInt();
        a[1]=in.nextInt();
        a[2]=in.nextInt();
        ou.info("The array elements are :");
        while( i<3) {
            int finalI = i;
            int finalI1 = i;
            ou.log(Level.INFO,()->"a["+ finalI +"]=>"+a[finalI1]);
            i++;
        }
        //replacing any element of any index
        ou.info("/***You can replace the elements at particular Indexs***/\nEnter the index number and element that you want to replace");
        ou.info("INDEX: ");
        int b=in.nextInt();
        if(b<3){
            ou.info("ELEMENT :");
            int c=in.nextInt();
            a[b]=c;
            int j=0;
            while (j<3) {
                int finalJ = j;
                int finalJ1 = j;
                ou.log(Level.INFO,()->"a[" + finalJ + "]=>" + a[finalJ1]);
                j++;
            }
        }
        else ou.info("Entered index is out of array size...");


        in.close();
    }

}




