package Lesson6;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int yourNumber = sc.nextInt();

        for (int i=10; i<=yourNumber; i+=10){
            System.out.print(i + " ");
        }

    }
}
