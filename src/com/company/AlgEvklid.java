package com.company;

import java.util.Scanner;

public class AlgEvklid {
    static int getNumb() {
        Scanner num = new Scanner(System.in);

        return num.nextInt();
    }

    static int gcd(int x, int y) {
        if (y == 0) {

            return x;
        }

        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        System.out.print("Enter a: ");
        int a = getNumb();

        System.out.print("Enter b: ");
        int b = getNumb();

        try {
            System.out.print(gcd(a, b));
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        }

    }


}