package assignment.pkg6;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Owner
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner for user input 
        Scanner input = new Scanner(System.in);
        // asking the user to input the number of people with which they wish to calculate their average among 
        System.out.println("Please enter the number of people there are: ");
        int numofpeople = input.nextInt();
        // creating a double for the height of the people inputted 
        double[] height = new double[numofpeople];
        // asking the user what the heights of the inputted people are 
        System.out.println("What are their heights in metres? ");
        // for loop for the number of people (saving the heights and a double)
        for (int i = 0; i < numofpeople; i++) {
            height[i] = input.nextDouble();
        }
        // creating a double for the total amount of heights inputted 
        double totalamount = 0;
        // for lopp for addding the heights together in order to calculate the average
        for (int i = 0; i < numofpeople; i++) {
            totalamount = totalamount + height[i];

        }
        // calculating the average 
        totalamount = totalamount / height.length;

        // for loop for giving the user the heights which are all above average 
        for (int i = 0; i < numofpeople; i++) {
            if (height[i] > totalamount) {
                // informing the user what the above average heights are 
                System.out.println("Heights whihc are above avergae: " + height[i] + "metres");
            }
        }

    }

}
