package com.company;

import java.util.Scanner;

public class DiophEquat {

    static int getDiophEquat() {
        Scanner scan = new Scanner(System.in);
        int errorInput = 0;
        int quant = 0;
        final int size = 1001;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        for (int i = 0; i < size; i++) {

            if (i != e && ((((a * i * i * i) + (b * i * i) + (c * i) + d) / (i - e)) == 0) && errorInput == 0) {
                quant += 1;
                System.out.print(quant);
            } else if (quant == 0) {
                System.out.print("0");
                break;
            }

        }


        return 0;
    }


    public static void main(String[] args) {

        try {
            getDiophEquat();
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        } catch (java.lang.NumberFormatException e) {
            System.out.print("Error");
        }
    }


}

