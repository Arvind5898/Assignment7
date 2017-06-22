/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        factors(456);

    }

    public static void factors(int parameter) {

        for (int i = 1; i <= parameter; i++) {

            if (parameter % i == 0) {
                System.out.print(i + " ");
            }

        }

    }
}
