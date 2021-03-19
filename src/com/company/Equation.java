package com.company;

import java.util.Scanner;

public class Equation {
    static int getNumb() {
        Scanner num = new Scanner(System.in);

        return num.nextInt();
    }

    public static void main(String[] args) {
        try {
            System.out.println("(ax + b)/(cx + d) = 0");

            System.out.print("Enter a: ");
            double a = getNumb();

            System.out.print("Enter b: ");
            double b = getNumb();

            System.out.print("Enter c: ");
            double c = getNumb();

            System.out.print("Enter d: ");
            double d = getNumb();

            if ((b * c == a * d) && a != 0 && b != 0) {

                System.out.println("NO");
            } else if (a == 0 && b == 0) {

                System.out.println("INF");
            } else if (((-d / c) != 0) && a != 0 && b != 0) {

                double x = -b / a;
                int xInt = (int) x;

                System.out.println(xInt);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        }

    }


}