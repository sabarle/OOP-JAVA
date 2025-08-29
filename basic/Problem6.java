/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem6 {
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();
        
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;
        
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println(firstNumber + " x " + secondNumber + " = " + product);
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);
        System.out.println(firstNumber + " mod " + secondNumber + " = " + remainder);
        
        scanner.close();
    }
}
