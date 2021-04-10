package com.company;

import java.util.Scanner;

public class Checkers {

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
            int diffx = Math.abs(x1 - x2);
            int diffy = Math.abs(y1 - y2);

            if (((diffx % 2 != 0 && diffy % 2 != 0) || (diffx % 2 == 0 && diffy % 2 == 0)) && diffx <= diffy && y2 >= y1) {

                res = "YES";
            }

            System.out.println(res);
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        }

    }
}


