package Lesson7.ArraySorting;

import java.util.Scanner;

public class QuickSort {
    public static void sort(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Please enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }


        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
