/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ampfa
 */

import java.util.Scanner;
public class JavaApplication1 {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int number1,number2,subtraction;
        System.out.println("Enter the first number");
        number1 = input.nextInt();
        System.out.println("Enter the second number");
        number2 = input.nextInt();
        subtraction = number1-number2;
        System.out.println("difference between two numbers"+subtraction);
    }
}
       