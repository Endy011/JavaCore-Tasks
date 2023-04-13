package Lesson6;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double power = 0;
        System.out.print("Please enter a number: ");
        int yourNumber = sc.nextInt();

        for (int j = 1; j <= yourNumber; j++) {     //1'den yourNumbera qeder olan butun ededlerin
            String num = j + "";                      //Armstrong ededi olub olmadigini yoxlayir
            power = 0;
            for (int i = 0; i < num.length(); i++) {
                char ch = num.charAt(i);
                double a = ch - '0';

                if (i != num.length() - 1) {
                    System.out.print(Math.pow(a, 3) + " + ");
                } else {
                    System.out.print(Math.pow(a, 3) + " = ");
                }

                power += Math.pow(a, 3);
            }

            System.out.print(power + "   ");
            System.out.println(num);

            if (Integer.parseInt(num) == power) {
                System.out.println("This number is an ARMSTRONG number <-----");
            } else {
                System.out.println("This number is not an Armstrong number");
            }
        }
    }
}