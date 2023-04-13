package Lesson6;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String num = sc.next(), reverse = "";

        for (int i = num.length()-1; i >= 0; i--) {
            reverse += num.charAt(i);
        }
        System.out.println("Reversed number: " + reverse);
    }
}
