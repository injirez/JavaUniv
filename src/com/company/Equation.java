package com.company;

import java.util.Scanner;

public class Equation {


    public static void main(String[] args) {
        try {
            Scanner num = new Scanner(System.in);

            System.out.println("(ax + b)/(cx + d) = 0");

            System.out.print("Enter a: ");
            int a = num.nextInt();

            System.out.print("Enter b: ");
            int b = num.nextInt();

            System.out.print("Enter c: ");
            int c = num.nextInt();

            System.out.print("Enter d: ");
            int d = num.nextInt();

            if (a == 0 && b == 0) {
                System.out.println("INF");
            } else if (a == 0 || b * c == a * d) {
                System.out.println("NO");
            } else if (b % a == 0) {
                int x = (-b / a);
                System.out.println(x);
            } else {
                System.out.println("NO");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        }

    }


}