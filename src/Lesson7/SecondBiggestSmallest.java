package Lesson7;

import java.util.Scanner;

public class SecondBiggestSmallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Please enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[i]) {
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        int secondSmallest = arr[1];
        int secondBiggest = arr[size-2];

        System.out.println(secondSmallest + " " + secondBiggest);
    }
}
