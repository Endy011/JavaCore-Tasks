package Lesson6;

import java.util.Scanner;

public class PositivesInArray {
    public static void main(String[] args) {
        NumCheck();

    }

    public static void NumCheck() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        System.out.print("Please enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("All the positive numbers in your array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0) {
                System.out.print(arr[i] + " ");
                sum += arr[i];
            }
        }


        System.out.println("\nThe sum of the positive numbers in your array: " + sum);
    }
}
