package Lesson6;

import java.util.Scanner;

public class FibonacciNums {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long yourNumber, num1 = 0, num2 = 1, num3;
        yourNumber = sc.nextInt();

        System.out.print(num1 + " " + num2);
        for (int i = 2; i < yourNumber; i++) {  //2'den yourNumber'a qeder butun Fibonacci ededlerini cap etdirir
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
