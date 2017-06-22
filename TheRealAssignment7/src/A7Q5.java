/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        chaotic(5);

    }

    public static void chaotic(int parameter) {

        for (int i = 0; i < parameter; i++) {

            int randomNumber = (int) (Math.random() * (5 - 1 + 1)) + 1;

            for (int x = 0; x < randomNumber; x++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
