package Lesson3;

import java.util.Scanner;

public class DivideWithoutOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 2 numbers: ");
        int divident = sc.nextInt();
        int divisor = sc.nextInt();
        int count = 0;

        while (divident - divisor >= 0) {
            count++;
            divident -= divisor;
        }
        System.out.println("The answer is: " + count);

    }
}
