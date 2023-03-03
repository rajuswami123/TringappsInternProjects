package org.example;

import java.util.Scanner;

import static org.example.BasicShape.basicShape;
import static org.example.Bp2d.basicshpae2D;
import static org.example.Calculator.calculator;
import static org.example.Cc.creditCard;
import static org.example.ContactList.contactList;
import static org.example.Dbp.databasePOOl;
import static org.example.HashMapTree.internalwokHash;
import static org.example.Lists.collections_1;
import static org.example.Student.studentGPA_7;
import static org.example.Students.assingment_3;
import static org.example.TicMain.ticMain;
import static org.example.TringappsBankAcc.TringappsBank;
import static org.example.WordFrequencyCounter.wordFrequencyCounter;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
       int a;
        System.out.println("Enter the project ID you want to open : ");
       Scanner in=new Scanner(System.in);
       a=in.nextInt();
        if((a<=0 || a>=15)){
            System.out.println("you entered invalid project id");
        }
        else{
       while(a>0){
           switch (a){
               case 1 :
                   TringappsBank();
                   break;
               case 2 :
                   basicShape();
                   break;
               case 3 :
                   assingment_3();
                   break;
               case 4 :
                   databasePOOl();
                   break;
               case 5 :
                   basicshpae2D();
                   break;
               case 6 :
                   creditCard();
                   break;
               case 7:
//                   ??exceptions
                   break;

               case 8 :
                   studentGPA_7();
                   break;
               case 9 :
                   collections_1();
                   break;
               case 10 :
                   internalwokHash();
                   break;
               case 11 :
                   calculator();
                   break;
               case 12 :
                   contactList ();
                   break;
               case 13 :
                   wordFrequencyCounter();
                   break;
               case 14 :
                   ticMain();
                   break;


           }

       }

    }
}}