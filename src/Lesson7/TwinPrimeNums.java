package Lesson7;

public class TwinPrimeNums {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i/2; j++) {
                if (i%j == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                System.out.print(i+" ");
                count++;
                if (count%2 == 0) {
                    System.out.println();
                }
            }

        }

    }
}
