package com.company;

import java.util.Scanner;

public class KingMove {
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

            //  HORIZONTAL
            if ((x1 + 1 == x2) || (x1 - 1 == x2) && y1 == y2) {

                res = "YES";
            }

            //  VERTICAL
            else if ((y1 + 1 == y2) || (y1 - 1 == y2) && x1 == x2) {

                res = "YES";
            }

            //  DIAGONAL
            else if ((x1 + 1 == x2 && y1 + 1 == y2) || (x1 + 1 == x2 && y1 - 1 == y2) || (x1 - 1 == x2 && y1 + 1 == y2) || (x1 - 1 == x2 && y1 - 1 == y2)) {

                res = "YES";
            }

            System.out.println(res);
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        }
    }
}