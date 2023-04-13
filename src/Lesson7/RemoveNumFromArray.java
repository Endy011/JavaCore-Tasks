package Lesson7;

import java.util.Scanner;

public class RemoveNumFromArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.print("Please enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Please enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Please enter the number you want to remove: ");
        int yourNumber = sc.nextInt();

        for (int i = 0; i < arr.length; i++){
            if (yourNumber == arr[i]){
                num = i;
            }
        }

        System.out.print("The final array: ");
        for (int i = 0; i<arr.length; i++){
            if (i != num){
                System.out.print(arr[i]+ " ");
            }
        }

    }
}
