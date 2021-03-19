package com.company;

import java.util.Scanner;

public class SeqRev {
    static int getNumb() {
        Scanner num = new Scanner(System.in);

        return num.nextInt();
    }

    static int reverse() {
        int x = getNumb();
        if (x != 0) {

            reverse();
        }
        System.out.println(x);
        return 0;
    }

    public static void main(String[] args) {

        try {
            reverse();
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        }
    }


}