package Lesson7;

import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your investment value: ");
        double investment = sc.nextInt();

        System.out.print("Please enter your rate of interest: ");
        double rate = sc.nextInt();

        System.out.print("Please enter your number of years: ");
        int years = sc.nextInt();

        for (int i = 0; i < years; i++) {
            System.out.println(futureValue(investment, rate, years));
            investment = futureValue(investment, rate, years);
        }
    }

    public static double futureValue(double investment, double rate, double years){

        double result=0;

        for (int i = 0; i < 12; i++) {
            result = (investment/12)/rate;
            investment += result;
        }
        return investment;
    }
}
