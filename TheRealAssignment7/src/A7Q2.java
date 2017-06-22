/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        examGrade(78);
    }

    public static void examGrade(int grade) {
        if (grade < 50) {
            System.out.println("F");
        }
        if (grade < 60 && grade >= 50) {
            System.out.println("D");
        }
        if (grade < 70 && grade >= 60) {
            System.out.println("C");
        }
        if (grade < 80 && grade >= 70) {
            System.out.println("B");
        }

        if (grade >= 80) {
            System.out.println("A");
        }
    }
    
}
