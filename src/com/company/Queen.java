package com.company;

import java.util.Scanner;

public class Queen {


    static int getQueen() {
        Scanner num = new Scanner(System.in);
        final int size = 8;
        int[] xArr = new int[size];
        int[] yArr = new int[size];
        boolean correct = true;

        for (int i = 0; i < xArr.length; i++) {
            xArr[i] = num.nextInt();
            yArr[i] = num.nextInt();
        }

        for (int i = 0; i < xArr.length; i++) {
            for (int j = i + 1; j < xArr.length; j++) {
                if (xArr[i] == xArr[j] || yArr[i] == yArr[j] || Math.abs(xArr[i] - xArr[j]) == Math.abs(yArr[i] - yArr[j])) {
                    correct = false;
                }
            }
        }
        if (correct) {
            System.out.print("NO");
        } else {
            System.out.print("YES");
        }


        return 0;

    }

    public static void main(String[] args) {

        try {
            getQueen();
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        } catch (java.lang.NumberFormatException e) {
            System.out.print("Error");
        }
    }


}

