/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class question9 {
        public static void main(String[] args) {
        int start = 20;
        int end = 25;
        int sum = 0;
        
        System.out.println("Numbers between " + start + " and " + end + ":");
        do {
            sum += start;
            System.out.println(start);
            start++;
        } while (start <= end);
        
        System.out.println("Sum: " + sum);
    }
}

    
