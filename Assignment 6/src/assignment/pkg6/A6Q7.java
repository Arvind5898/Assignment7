/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6;

/**
 *
 * @author Owner
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] sieve = new int[101];

        int[] sieve2 = new int[1001];

        for (int i = 1; i < 100; i++) {
            sieve2[i] = sieve2[i - 1] + 1;

        }
        for (int i = 1; i < 100; i++) {
            sieve[i] = sieve[i - 1] + 1;

        }
        for (int i = 1; i < 100; i++) {
            sieve[i] = sieve[i - 1] + 1;

        }
        int gi = 0;

        for (int i = 2; i < 1001; i++) {
            for (int a = 2; a < 100; a++) {
                gi = sieve[i] * a;

                for (int y = 2; y < 100; y++) {
                    if (sieve2[y] == gi) {
                        sieve2[y] = -1;

                    }
                }
            
        }}
        
        for(int z = 2; z < 100; z++){
            if(sieve2[z] != -1){
                System.out.println(sieve2[z]);
            }
        }

    }
}
