package com.company;

import java.util.Scanner;

public class AlgEvklid {

    static int gcd(int x, int y) {
        if (y == 0) {

            return x;
        }

        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        try {
            System.out.print("Enter a: ");
            int a = num.nextInt();

            System.out.print("Enter b: ");
            int b = num.nextInt();

            System.out.print(gcd(a, b));
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        }


    }


}