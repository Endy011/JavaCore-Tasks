package Lesson7;

public class NumPyramid {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
