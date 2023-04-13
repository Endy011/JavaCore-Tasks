package Lesson3;

import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        double average = (num1 + num2 + num3) / 3;

        System.out.print("The average of the numbers you entered is: " + average);

    }
}
