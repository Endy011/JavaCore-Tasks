package Lesson5;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        InitializeArray(arr);
        ArraySum(arr);

    }

    public static void InitializeArray(int[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

    public static void ArraySum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the numbers in your array is: " + sum);
    }
}
