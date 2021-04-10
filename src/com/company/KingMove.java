package com.company;

import java.util.Scanner;

public class KingMove {

    public static void main(String[] args) {
        try {
            Scanner num = new Scanner(System.in);

            System.out.print("Enter x1: ");
            int x1 = num.nextInt();

            System.out.print("Enter y1: ");
            int y1 = num.nextInt();

            System.out.print("Enter x2: ");
            int x2 = num.nextInt();

            System.out.print("Enter y2: ");
            int y2 = num.nextInt();

            String res = "NO";

            if ((x1 + 1 == x2) || (x1 - 1 == x2) && y1 == y2) {

                res = "YES";
            } else if ((y1 + 1 == y2) || (y1 - 1 == y2) && x1 == x2) {

                res = "YES";
            } else if ((x1 + 1 == x2 && y1 + 1 == y2) || (x1 + 1 == x2 && y1 - 1 == y2) || (x1 - 1 == x2 && y1 + 1 == y2) || (x1 - 1 == x2 && y1 - 1 == y2)) {

                res = "YES";
            }

            System.out.println(res);
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        }
    }
}