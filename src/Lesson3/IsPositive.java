package Lesson3;

import java.util.Scanner;

public class IsPositive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0) {
            System.out.println("Both numbers are positive");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("Both numbers are negative");
        } else {
            System.out.println("One of the numbers is positive and the other one is negative");
        }

    }
}
