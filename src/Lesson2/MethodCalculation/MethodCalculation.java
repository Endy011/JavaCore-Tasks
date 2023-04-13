package Lesson2.MethodCalculation;

import java.util.Scanner;

public class MethodCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 3 numbers: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        System.out.print("Your solution is: ");
        MySolution.solution(firstNumber, secondNumber, thirdNumber);
    }
}
