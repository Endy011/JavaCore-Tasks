package Lesson6;

import java.util.Scanner;

public class EbobEkob {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Please enter the second number: ");
            int b = sc.nextInt();

            System.out.println("EBOB(a, b) = " + ebob(a, b));
            System.out.println("EKOB(a, b) = " + ekob(a, b));

        }

        public static int ebob(int a, int b){
            if(a%b == 0){
                return b;
            } else {
                return ebob(b, a%b);    //bu metod ozu ozunu cagirir yani rekursivdir
            }
        }

        public static int ekob(int a, int b){
            return (a*b / ebob(a,b));   //a*b = ebob(a, b) * ekob(a, b) olduguna gore
        }                               //ekob(a, b) = a*b / ebob(a, b)
}