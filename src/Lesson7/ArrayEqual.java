package Lesson7;

import java.util.Scanner;

public class ArrayEqual {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the arrays: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] arr1 = new int[size];

        System.out.print("Please enter the elements of the first array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Please enter the elements of the second array: ");
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = sc.nextInt();
        }

        boolean isEqual = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr1[i]) {
                isEqual = false;
                break;
            }
        }
        if (isEqual) {
            System.out.println("The arrays are equal");
        } else {
            System.out.println("The arrays are not equal");
        }
    }
}
