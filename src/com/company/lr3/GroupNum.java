package com.company.lr3;

import java.util.Scanner;

public class GroupNum {

    public static void main(String[] args) {
        try {
            Scanner strScan = new Scanner(System.in);
            Scanner intScan = new Scanner(System.in);
            String pattern = "М3О-(.*)\\d\\d\\dБ-(.*)(\\b14|15|16|17|18|19\\b)";
            int size = intScan.nextInt();
            String[] strArr = new String[size];


            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = strScan.nextLine();
            }
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].matches(pattern)) {
                    System.out.println(strArr[i]);

                }

            }
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Error");
        }
    }
}

