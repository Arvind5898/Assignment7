/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int initial = firstDigit(45673);
        
        System.out.println(initial);
    }
    
    public  static int firstDigit(int number){
        if(number > 10){
            number = number / 10;
        }
        if(number < 0){
            number = number * -1;
        }
    return number;
    
}
}
