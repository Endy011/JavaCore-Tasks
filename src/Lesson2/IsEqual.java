package Lesson2;

import java.util.Scanner;

public class IsEqual {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 2 numbers: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("The numbers you've entered are equal");
        } else {
            System.out.println("The numbers you've entered aren't equal");
        }
    }
}
