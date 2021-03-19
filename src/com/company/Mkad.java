package com.company;

import java.util.Scanner;

public class Mkad {
    static int getNumb() {
        Scanner num = new Scanner(System.in);

        return num.nextInt();
    }

    public static void main(String[] args) {
        try {
            System.out.print("Enter v: ");
            int v = getNumb();

            System.out.print("Enter t: ");
            int t = getNumb();

            if (t < 0) {

                System.out.println("Error");
            } else {
                int res = 0;
                final int numMark = 108;
                res = Math.abs((v * t) % numMark + 1);

                System.out.println(res);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        }
    }


}
