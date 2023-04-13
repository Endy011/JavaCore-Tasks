package Lesson5;

import java.util.Scanner;

public class ArrayDoubling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the initial array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] arr2 = new int[size*2];

        InitializeArray(arr);
        PrintArray(arr);
        DoubleArray(arr, arr2);
        System.out.println();
        PrintArray(arr2);

    }

    public static void InitializeArray(int[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

    public static void DoubleArray(int[] arr, int[] arr2) {
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            arr2[i+arr.length] = arr[i];
        }
    }

    public static void PrintArray(int[] arr) {
        System.out.print("Your array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
