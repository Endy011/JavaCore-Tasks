package Lesson3;

import java.util.Scanner;

public class SmallestEvenMultiple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        if (num%2 == 0){
            System.out.println("The smallest even multiple is: "+ num);
        } else {
            System.out.println("The smallest even multiple is: "+ num*2);
        }
    }
}
