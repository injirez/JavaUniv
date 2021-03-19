package com.company;

import java.util.Scanner;

public class Checkers {
    static int getNumb() {
        Scanner num = new Scanner(System.in);

        return num.nextInt();
    }

    public static void main(String[] args) {
        try {
            System.out.print("Enter x1: ");
            int x1 = getNumb();

            System.out.print("Enter y1: ");
            int y1 = getNumb();

            System.out.print("Enter x2: ");
            int x2 = getNumb();

            System.out.print("Enter y2: ");
            int y2 = getNumb();

            String res = "NO";

            if ((x1 + y1) % 2 != (x2 + y2) % 2) {

                res = "YES";
            } else if ((x1 - (y2 - y1) <= x2) && (x2 <= (x1 + (y2 - y1)))) {

                res = "YES";
            }

            System.out.println(res);
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        }

    }
}


