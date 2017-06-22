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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner for user input
        Scanner input = new Scanner(System.in);
        // asking the user how many students are in the class
        System.out.println(" How many students are in the class? ");
        // creating a double for the number odf students 
        double students = input.nextDouble();
        // creating a double called list for the inputting of marks 
        double[] list = new double[3];
        // asking the user to enter the marks according to each student 
        System.out.println("Enter marks here:");
        // for loop for the marks which were inputed (storing them)
        for (int i = 0; i < students; i++) {
            list[i] = input.nextDouble();
        }
        // creating a double for the total 
        double total = 0;
        // for loop for the totalling of the marks of the students
        for (int i = 0; i < students; i++) {
            total = total + list[i];
        }
        total = total / list.length;

        total = total * 100;
        total = Math.ceil(total);
        total = total / 100;
        // informing the user about the class average according to the inputed marks 
        System.out.println(" The calculated class average is " + total + "%");

    }

}
