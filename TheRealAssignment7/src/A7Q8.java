/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class A7Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        season(4, 16);
    }

    public static void season(int month, int day) {
        if (month < 3 && month > 0) {
            System.out.println("winter");

        }
        if (month > 3 && month < 6) {
            System.out.println("Spring");
        }
        if (month > 6 && month < 9) {
            System.out.println("Summer");

        }
        if (month > 9 && month < 12) {
            System.out.println("Fall");
        }
        if (month == 9) {
            if (day >= 16) {
                System.out.println("Fall");
            } else {
                System.out.println("Summer");
            }

            if (month == 12) {
                if (day >= 16) {
                    System.out.println("Winter");

                } else {
                    System.out.println("Fall");
                }
            }
        }
    }

}
