package com.company;

import java.util.Scanner;

public class EvenNum {

    static int getEvenNum() {
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
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        return 0;

    }

    public static void main(String[] args) {

        try {
            getEvenNum();
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        } catch (java.lang.NumberFormatException e) {
            System.out.print("Error");
        } catch (java.util.NoSuchElementException e) {
            System.out.print("Error");
        }
    }


}

