/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usermark
 */
import java.util.Scanner;
public class question1 {
   public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the student's full name: ");
        String fullName = scanner.nextLine();

        
        String[] subjects = new String[5];
        double[] marks = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();

            System.out.print("Enter the marks for " + subjects[i] + ": ");
            marks[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        
        System.out.println("\nStudent Name: " + fullName);
        System.out.println("------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("Subject: " + subjects[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println("Grade: " + calculateGrade(marks[i]));
            System.out.println("------------------------------");
        }

        scanner.close();
    }

    
    public static String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}

    