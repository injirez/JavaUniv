package com.company.lr7;

import java.util.Scanner;

public class Transfers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            final int hundred = 100;
            if (a > hundred || b > hundred || c > hundred || d > hundred) {
                System.out.println("ERROR!");
            } else {
                if (a > b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
                if (c > d) {
                    int temp = c;
                    c = d;
                    d = temp;
                }
                int counter = 0;
                for (int i = a; i < b + 1; i++) {
                    for (int j = c; j < d + 1; j++) {
                        if (i == j) {
                            counter++;
                        }
                    }
                }

                System.out.println(counter);

            }


        } catch (Exception e) {
            System.out.println("ERROR!");
        }


    }


}