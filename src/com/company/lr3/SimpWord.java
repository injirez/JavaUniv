package com.company.lr3;

import java.util.Scanner;

public class SimpWord {


    public static void main(String[] args) {
        try {
            final int size = 10;
            final int wordLength = 6;
            Scanner str = new Scanner(System.in);

            String[] strArr = new String[size];
            int counter = 0;

            for (int i = 0; i < size; i++) {
                strArr[i] = str.nextLine();
            }
            for (int i = 0; i < size; i++) {
                if (strArr[i].startsWith("S") && strArr[i].contains("i") && strArr[i].length() == wordLength) {
                    counter++;
                }
            }

            System.out.println(counter);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Error");
        }

    }
}

