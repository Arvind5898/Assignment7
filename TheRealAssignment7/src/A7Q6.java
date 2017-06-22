/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int digit = lastDigit(1777);
        if(digit < 0){
            digit = digit * -1;
        }
        System.out.println(digit);
        
    }
    
    public static int lastDigt(int intnumber){
        intnumber = intnumber % 10;
        return intnumber;
        
    }

}