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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner for user input 
        Scanner input = new Scanner(System.in);

        // asking the user for 2 ints
        int[] integer = new int[3];

        // for loop created for saving the inputted integers
        for (int i = 0; i < 2; i++) {
            integer[i] = input.nextInt();
        }
        // defining the first inputted integer
        int o1 = integer[0];
        // defining the secong inputted integer 
        int o2 = integer[1];

        if (o1 > o2) {
            integer[0] = o1;
            integer[1] = o2;

        }
        // informing the user of the integers placed into ascending order 
        System.out.println("The integers in ascending order are: " + integer[0] + "" + integer[1]);

    }
}
