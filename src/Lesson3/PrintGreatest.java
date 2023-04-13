package Lesson3;

import java.util.Scanner;

public class PrintGreatest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("The greatest number is: " + GreatestNumber(num1, num2, num3));
    }

    public static int GreatestNumber(int a, int b, int c) {
        if (a>b && a>c) {
            return a;
        } else if (b>a && b>c) {
            return b;
        } else{
            return c;
        }
    }
}
