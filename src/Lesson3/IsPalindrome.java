package Lesson3;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String num = sc.next();
        String rev = "";

        for (int i = num.length()-1; i >= 0; i--) {
            rev += num.charAt(i);
        }

        if (num.equals(rev)) {
            System.out.println("This number is a palindrome");
        } else {
            System.out.println("This number is not a palindrome");
        }

    }
}
