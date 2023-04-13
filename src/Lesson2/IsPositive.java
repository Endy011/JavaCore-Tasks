package Lesson2;

import java.util.Scanner;

public class IsPositive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int myNum = sc.nextInt();

        if (myNum > 0) {
            System.out.println("The number you've entered is positive");
        } else {
            System.out.println("The number you've entered is negative");
        }
    }
}
