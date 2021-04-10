package com.company;

import java.util.Scanner;

public class ArrCompr {

    public static Scanner num = new Scanner(System.in);

    static int getArrComp() {


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
        int i = 0;
        for (int j = 0; j < size; j++) {
            if (arr[j] != 0) {
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                i++;
            }

        }

        for (int a = 0; a < size; a++) {
            System.out.print(arr[a] + " ");
        }

        return 0;

    }

    public static void main(String[] args) {

        try {
            getArrComp();
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        } catch (java.lang.NumberFormatException e) {
            System.out.print("Error");
        }
    }


}

