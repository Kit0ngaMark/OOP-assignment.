/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class question2 {
        public static void main(String[] args) {
                System.out.println("Unlabeled Break Statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break; 
            }
            System.out.println("i = " + i);
        }
        
             
        System.out.println("\nLabeled Break Statement:");
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outerLoop; 
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}

    

