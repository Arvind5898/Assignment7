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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner for the user's input
        Scanner input = new Scanner(System.in);
        // asking the user to enter 10 marks
        System.out.println("Please enter 10 marks");
        // creating array for the marks
        int[] integer = new int[10];
        int change = 0;
        // for loop created to save the inputted marks (10
        for (int i = 0; i < 10; i++) {
            integer[i] = input.nextInt();

        }

        for (int i = 0; i < 10; i++) {
            for (int x = 1; x < 10 - i; x++) {

                if (integer[x] < integer[x - 1]) {

                    change = integer[x];
                    // making the smallest integer commence in the order
                    integer[x] = integer[x - 1];
                    integer[x - 1] = change;
                }
            }
        }
        // outputting all integers in ascending order
        for (int i = 0; i < 10; i++) {
            System.out.print(integer[i] + ",");
        }

    }

}
