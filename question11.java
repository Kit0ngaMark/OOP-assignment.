/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class question11 {
    public static void main(String[] args) {
        int number = 0;
        
        System.out.println("Prime numbers from 0 to 100:");
        while (number <= 100) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            number++;
        }
    }
    
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}

    
