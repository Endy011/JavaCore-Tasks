package Lesson6;

public class Calculation {
    public static void main(String[] args) {

        int count = 0;
        long product = 1;

        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i/2; j++) {
                if (i%j==0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                count += i;
                product *= i;
            }
        }

        System.out.println(product);
        System.out.println(count);
        System.out.println(product-count);
    }
}
