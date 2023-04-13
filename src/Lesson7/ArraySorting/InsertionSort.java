package Lesson7.ArraySorting;

import java.util.Scanner;

public class InsertionSort {
    public static void sort(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Please enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
