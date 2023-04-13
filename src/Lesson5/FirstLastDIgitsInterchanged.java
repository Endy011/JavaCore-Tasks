package Lesson5;

import java.util.Scanner;

public class FirstLastDIgitsInterchanged {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        while (num < 100 || num > 999) {
            System.out.print("Please enter a 3 digit number: ");
            num = sc.nextInt();
        }

        int result = (num%10*100)+(num%100-num%10)+(num/100);
        System.out.println(result);
    }
}
