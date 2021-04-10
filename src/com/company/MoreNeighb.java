package com.company;

import java.util.Scanner;

public class MoreNeighb {

    public static int counter;

    static int getMoreNeighb() {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = num.nextInt();

        int[] arr = new int[size];

        if (size <= 0) {
            System.out.println("Error");
        }
        System.out.println("Enter array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = num.nextInt();
        }
        for (int i = 1; i < size - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                counter++;
            }
        }

        System.out.println(counter);

        return 0;

    }

    public static void main(String[] args) {

        try {
            getMoreNeighb();
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        } catch (java.lang.NumberFormatException e) {
            System.out.print("Error");
        }
    }


}

