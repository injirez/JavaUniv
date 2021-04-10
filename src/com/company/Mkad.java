package com.company;

import java.util.Scanner;

public class Mkad {
    static int getNumb() {
        Scanner num = new Scanner(System.in);

        return num.nextInt();
    }

    public static void main(String[] args) {
        try {
            Scanner num = new Scanner(System.in);
            System.out.print("Enter v: ");
            int v = num.nextInt();

            System.out.print("Enter t: ");
            int t = num.nextInt();

            if (t < 0) {
                System.out.println("Error");
            } else {
                int res = 0;
                final int numMark = 109;
                if (v < 0) {
                    res = numMark - Math.abs((v * t) % numMark);
                } else {
                    res = Math.abs((v * t) % numMark);
                }


                System.out.println(res);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        }
    }


}
