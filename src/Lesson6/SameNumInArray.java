package Lesson6;

import java.util.Scanner;

public class SameNumInArray {
    public static void main(String[] args) {

        if(numCheck() != 0){
            System.out.println("your number exists in the array");
        } else {
            System.out.println("Your number does not exist in the array");
        }
    }

    public static int numCheck() {
        Scanner sc = new Scanner(System.in);

        int result = 0;

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];


        System.out.print("Enter your numbers: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to search: ");
        int num = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == num){
                result++;
            }
        }

        return result;
    }
}
