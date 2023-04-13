package Lesson4;

public class PrintPatterns {
    public static void main(String[] args) {
        Pattern1();
        System.out.println();
        Pattern2();
    }

    public static void Pattern1() {
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern2() {
        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
