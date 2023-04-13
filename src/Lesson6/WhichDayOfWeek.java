package Lesson6;

import java.util.Scanner;

public class WhichDayOfWeek {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Please enter a number: ");
        int num = sc.nextInt();

        while (num<1 || num>7){
            System.out.printf("Please enter a number between 1 and 7: ");
            num = sc.nextInt();
        }

        switch (num){
            case 1 : System.out.printf("Monday"); break;
            case 2 : System.out.printf("Tuesday"); break;
            case 3 : System.out.printf("Wednesday"); break;
            case 4 : System.out.printf("Thursday"); break;
            case 5 : System.out.printf("Friday"); break;
            case 6 : System.out.printf("Saturday"); break;
            case 7 : System.out.printf("Sunday"); break;
        }

    }
}
