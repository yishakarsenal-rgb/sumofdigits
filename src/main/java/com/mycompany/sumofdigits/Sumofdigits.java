/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumofdigits;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Sumofdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number");
        int number = input.nextInt();
        int sum = 0;
        int a = Math.abs(number);
        while (a != 0) {
            sum += a % 10;  
            a /= 10; 
        }
        System.out.println("Sum of digits: " + sum);
        input.close();
    }
}
