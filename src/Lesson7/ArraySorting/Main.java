package Lesson7.ArraySorting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sorting methods:");
        System.out.println("1-Bubble sort | 2-Insertion sort | 3-Quick sort");
        System.out.print("Enter the sorting method you want to use: ");

        int method = sc.nextInt();

        System.out.println();

        if(method == 1){
            System.out.println("You chose Bubble sort");
            BubbleSort.sort();
        } else if (method == 2) {
            System.out.println("You chose Insertion sort");
            InsertionSort.sort();
        } else if (method == 3) {
            System.out.println("You chose Quick sort");
            QuickSort.sort();
        } else {
            System.out.println("Please choose one of the methods above");
        }


    }
}
