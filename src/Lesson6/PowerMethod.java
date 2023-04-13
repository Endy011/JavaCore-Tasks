package Lesson6;

import java.util.Scanner;

public class PowerMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Power(a, b));
    }

    public static int Power(int a, int b) {
        int c = 1;
        while (b>0){
            c *= a;
            b--;
        }
        return c;
    }
}
