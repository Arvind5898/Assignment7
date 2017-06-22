
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
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.println("Principle amount:");
        double principle = input.nextDouble();
        
        System.out.println("Interest Rate: ");
        double interest = input.nextDouble();
        
        System.out.println("Years:");
        int years = input.nextInt();
       
        
       
        double i = compoundInterest(principle, interest, years);
        
       
        System.out.println(i);
    }
   
    public static double compoundInterest(double iniPrinciple, double iniRate, int years) {

        
        double compoundI = iniPrinciple * Math.pow((1 + iniRate), years);
        
        return compoundI;

    
    }
    
}
