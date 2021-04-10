package com.company;

import java.util.Scanner;

public class SameCouple {

    public static int counter;

    static int getSameCouple() {
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
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }
        }

        System.out.println(counter);

        return 0;

    }

    public static void main(String[] args) {

        try {
            getSameCouple();
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        } catch (java.lang.NumberFormatException e) {
            System.out.print("Error");
        }
    }


}

