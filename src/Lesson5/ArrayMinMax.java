package Lesson5;

import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        InitializeArray(arr);
        ArrayMax(arr);
        ArrayMin(arr);

    }

    public static void InitializeArray(int[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

    public static void ArrayMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("The biggest element in your array is: " + max);
    }

    public static void ArrayMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The smallest element in your array is: " + min);
    }

}
