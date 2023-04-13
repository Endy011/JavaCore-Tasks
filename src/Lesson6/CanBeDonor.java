package Lesson6;

import java.util.Scanner;

public class CanBeDonor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Please enter your age and weight: ");
        int age = sc.nextInt();
        int weight = sc.nextInt();

        if (age < 18 || weight < 50) {
            System.out.printf("You cant be a blood donor");
        }
    }
}
