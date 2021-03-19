package com.company;

import java.util.Scanner;

public class OnlySquare {
    public static int i = 0;
    public static int errorInput = 0;

    static int getNumb() {
        Scanner num = new Scanner(System.in);

        return num.nextInt();
    }

    static int reverse() {
        int x = getNumb();

        if (x != 0) {

            reverse();
        }
        if (errorInput == 0 && Math.sqrt(x) % 1 == 0 && x != 0) {

            i++;
            System.out.print(x);

            System.out.print(" ");
        }
        return 0;
    }

    public static void main(String[] args) {

        try {
            reverse();
            if (i == 0) {
                System.out.print(i);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        }

    }


}