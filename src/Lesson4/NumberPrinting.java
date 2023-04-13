package Lesson4;

public class NumberPrinting {
    public static void main(String[] args) {

        System.out.println("The odd numbers from 1 to 100 are: ");
        Odd();
        System.out.println("\nThe even numbers from 1 to 100 are: ");
        Even();
        System.out.println("\nThe prime numbers from 1 to 100 are: ");
        Prime();
        System.out.print("\nThe sum of the numbers from 1 to 100 are: ");
        SumTillHundred();
        System.out.print("The average of the numbers from 1 to 100 are: ");
        AverageOfHundred();
        System.out.print("The numbers that can be divided to both 5 and 7 from 1 to 200 are: ");
        FiveAndSeven();

    }

    public static void Odd() {
        for (int i = 1; i < 100; i+=2) {
            System.out.print(i + " ");
        }
    }

    public static void Even() {
        for (int i = 2; i <= 100; i+=2) {
            System.out.print(i + " ");
        }
    }

    public static void Prime() {
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i/2; j++) {
                if (i%j == 0){
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
        }
    }

    public static void SumTillHundred() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void AverageOfHundred() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        double avg = sum / 100;
        System.out.println(avg);
    }

    public static void FiveAndSeven() {
        for (int i = 1; i <= 200; i++) {
            if(i%5 == 0 && i%7 ==0) {
                System.out.print(i + " ");
            }
        }
    }
}
