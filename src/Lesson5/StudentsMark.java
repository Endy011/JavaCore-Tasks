package Lesson5;

import java.util.Scanner;

public class StudentsMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a mark: ");
        int mark = sc.nextInt();

        while (mark < 0 || mark > 100) {
            System.out.print("Please enter your mark correctly: ");
            mark = sc.nextInt();
        }

        if (mark > 90) {
            System.out.println("Your grade is: A");
        } else if (mark > 80) {
            System.out.println("Your grade is: B");
        } else if (mark > 70) {
            System.out.println("Your grade is: C");
        } else if (mark > 60) {
            System.out.println("Your grade is: D");
        } else if (mark > 50) {
            System.out.println("Your grade is: E");
        } else {
            System.out.println("Your grade is: F \nYou failed!");
        }

    }
}
