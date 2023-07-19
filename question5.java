/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        String grade = calculateGrade(score);

        System.out.println("Full Name: " + fullName);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static String calculateGrade(int score) {
        if (score >= 70 && score <= 100) {
            return "A";
        } else if (score >= 60 && score < 70) {
            return "B";
        } else if (score >= 50 && score < 60) {
            return "C";
        } else if (score >= 40 && score < 50) {
            return "D";
        } else if (score >= 0 && score < 40) {
            return "F";
        }else {
            System.out.println("Invalid score entered!");
            return"invalid score !!!";
        }
    }
}

    

