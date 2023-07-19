/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class question10 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        
        System.out.println("Enter integers (enter 0 to exit):");
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            
            sum += number;
        } while (number != 0);
        
        System.out.println("Sum: " + sum);
    }
}

    
