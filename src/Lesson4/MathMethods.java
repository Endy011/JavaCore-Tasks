package Lesson4;

import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args) {

        Remainder();
        TrianglePerimeter();
        SquareArea();
        CircleArea();

    }

    public static void Remainder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a divisor and and a dividend: ");
        int divisor = sc.nextInt();
        int dividend = sc.nextInt();
        System.out.println("The remainder is: " + (dividend%divisor));
    }

    public static void TrianglePerimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the sides of the triangle: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        System.out.println("The perimeter of the triangle is: "  + (side1+side2+side3));
    }

    public static void SquareArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the sides of the square: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        System.out.println("The area of the square is: " + (side1*side2));
    }

    public static void CircleArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        int radius = sc.nextInt();
        System.out.println("The area of the circle is: " + (radius*radius*Math.PI));
    }

}
