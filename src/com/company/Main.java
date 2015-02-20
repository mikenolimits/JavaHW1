package com.company;

import javax.swing.*;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        // write your code here


        while (true) {

            int uppercase = 0;
            int lowerCase = 0;
            int digits    = 0;

            String sentance = JOptionPane.showInputDialog("Please Type In a Sentence");

            if (sentance.equalsIgnoreCase("stop")) {
                break;
            }

            for (int i = 0; i <= sentance.length() - 1; i++) {

                char current = sentance.charAt(i);

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
            showCounter(uppercase, "uppercase");
            showCounter(lowerCase, "lowercase");
            showCounter(digits,       "digits");

        }
    }


    public static void showCounter(int count, String type){
        JOptionPane option = new JOptionPane();

        JOptionPane.showMessageDialog(option, String.format("There are %d %s letters", count, type));
    }
}

