package com.company;

import javax.swing.*;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        // write your code here


        //We create an infinite loop that keeps going until the exit condition is met.
        while (true) {

            //Counters to keep track of everything set to 0 on every loop.
            int uppercase = 0;
            int lowerCase = 0;
            int digits    = 0;
            Boolean exitCondition = false;

            String input    = JOptionPane.showInputDialog("Please Type In a Sentence");
            exitCondition   = input.equalsIgnoreCase("stop");

            if (exitCondition) {
                break;
            }
            //loop up to the size of the input so that we can get the current
            //character for every iteration and increment the counter for whatever
            //condition they meet.

            for (int i = 0; i <= input.length() - 1; i++) {

                char current = input.charAt(i);

                if (Character.isUpperCase(current)) {
                    uppercase++;
                }
                if (Character.isLowerCase(current)) {
                    lowerCase++;
                }
                if (Character.isDigit(current)) {
                    digits++;
                }

            }
            //Show a brutally annoying message dialog for every counter :P
            showCounter(uppercase, "uppercase");
            showCounter(lowerCase, "lowercase");
            showCounter(digits,    "digits");

        }
    }


    public static void showCounter(int count, String type){
        JOptionPane option = new JOptionPane();

        JOptionPane.showMessageDialog(option, String.format("There are %d %s letters", count, type));
    }
}

