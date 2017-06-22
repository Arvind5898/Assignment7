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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner to obtain the user's input 
        Scanner input = new Scanner(System.in);
        // ask the user for the size of the class
        System.out.println(" Please enter the size of the class:");
        // saving the size of the class as an integer
        int sizeofclass = input.nextInt();
        // asking the user to input all sizes 
        System.out.println("Please enter all " + sizeofclass + "sizes");
        // storing the inputted answer as a number
        double[] number = new double[sizeofclass];
        // double change (filler value used in order to change the number)
        double change = 0;
        // creating a for loop to save sizes which were innputted by the user
        for (int i = 0; i < sizeofclass; i++) {
            number[i] = input.nextDouble();
        }
        // for loop created for each mark in the arratyy
        for (int i = 0; i < sizeofclass; i++) {
            for (int a = 1; a < sizeofclass - i; a++) {
                if (number[a] < number[a - 1]) {
                    change = number[a];
                    number[a] = number[a - 1];
                    number[a - 1] = change;
                }
            }
        }
        // making a double to stroe the average within
        double average = 0;
        // for loop created to add the numbers 
        for (int i = 0; i < sizeofclass; i++) {
            average = average + number[i];

        }

        average = average / sizeofclass;
        // printing the lowest mark in the array
        System.out.println("The lowest mark:" + number[0]);
        // printing the highest mark 
        System.out.println(" The highest mark " + number[sizeofclass - 1]);
        // telling the user the calculated average 
        System.out.println("Class average: " + average);

    }

}
