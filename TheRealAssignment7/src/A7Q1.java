/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double answer = circleArea(4);
        System.out.println(answer);
    }
    
    public static double circleArea(double radius) {
        
        double area = Math.PI * Math.pow(radius, 2);
        
        return area;
    
    
    }
    
}
