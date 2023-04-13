package Lesson5;

import java.util.Scanner;

public class RepeatingElementArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        InitializeArray(arr);
        PrintArray(arr);
        System.out.println();
        PrintSame(arr);

    }

    public static void InitializeArray(int[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

    public static void PrintArray(int[] arr) {
        System.out.print("Your array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void PrintSame(int[] arr) {
        System.out.print("The repeating elements in your array are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
