/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class question12 {
        public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        
        System.out.println("Sum of odd numbers from 1 to 50:");
        while (number <= 50) {
            if (number % 2 != 0) {
                sum += number;
            }
            number++;
        }
        
        System.out.println("Sum: " + sum);
    }
}

    
