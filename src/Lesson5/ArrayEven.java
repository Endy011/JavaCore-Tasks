package Lesson5;

import java.util.Scanner;

public class ArrayEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        InitializeArray(arr);
        ArrayEven(arr);

    }

    public static void InitializeArray(int[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

    public static void ArrayEven(int[] arr) {
        System.out.print("The even numbers in your array are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
