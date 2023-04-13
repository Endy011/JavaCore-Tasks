package Lesson5;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        int sum = num/10 + num%10;

        System.out.println("The sum of the digits of your number is: " + sum);
    }
}
