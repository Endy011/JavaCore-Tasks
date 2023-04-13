package Lesson6;

import java.util.Scanner;

public class BiggestPlusSmallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a, b, c};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < 3; i++) {
            if (arr[i]>max) max = arr[i];
            if (arr[i]<min) min = arr[i];
        }

        System.out.println("The sum of smallest and biggest number is: " + min + " + " + max + " = " + (min + max));

    }
}
