package org.example;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator {
    public static void calculator() {
        Logger ou = Logger.getLogger("com.api.jar");
        Addition add = new Addition();
        add.setNum1(10);
        add.setNum2(5);
        ou.log(Level.INFO, () -> "Addition: " + add.performOperation());

        Operation subtract = new Subtraction();
        subtract.setNum1(10);
        subtract.setNum2(5);
        ou.log(Level.INFO, () -> "Subtraction: " + subtract.performOperation());

        Operation multiply = new Multiplication();
        multiply.setNum1(10);
        multiply.setNum2(5);
        ou.log(Level.INFO, () -> "Multiplication: " + multiply.performOperation());

        Operation divide = new Division();
        divide.setNum1(10);
        divide.setNum2(5);
        ou.log(Level.INFO, () -> "Division: " + divide.performOperation());
    }
}
