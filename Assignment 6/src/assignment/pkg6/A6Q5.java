/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a new scanner for user input
        Scanner input = new Scanner(System.in);
        // asking the user how many marks there are 
        System.out.println("Please enter how any marks there are:");
        // saving the amount of marks as an int
        int marks = input.nextInt();
        // asking the user to out put all marks
        System.out.println("Please enter all" + marks + "marks");
        // storing the amount of marks as a double 
        double[] numberofmarks = new double[marks];
        double change = 0;

        // for loop created for all the marks
        for (int i = 0; i < marks; i++) {
            numberofmarks[i] = input.nextInt();

        }// for loop created for each mark in the order 
        for (int i = 0; i < marks; i++) {

            for (int a = 1; a < marks - i; a++) {

                if (numberofmarks[a] < numberofmarks[a - 1]) {
                    // changing of the int labelled change for the actual integer
                    change = numberofmarks[a];
                    // changing the integers within the order(ascending order)
                    numberofmarks[a] = numberofmarks[a - 1];
                    numberofmarks[a - 1] = change;
                }
            }

        }

        for (int i = 0; i < marks; i++) {
            System.out.print(numberofmarks[i] + ",");
        }
        if (marks % 2 == 1) {
            marks = (marks - 1) / 2;
            System.out.println("The median is equal to" + numberofmarks[marks]);

        } else {
            double variablemedian = 0;
            variablemedian = ((double) numberofmarks[numberofmarks.length / 2] + (double) numberofmarks[numberofmarks.length / 2 - 1]) / 2;
            // telling the user what the calculated median is accoring to the inputted varoables 
            System.out.println("The median is equal to" + variablemedian);
        }
    }
}
