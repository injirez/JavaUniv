package com.company.lr3;

import java.util.Scanner;

public class FindUses {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String pattern = "\\bвремя\\b|\\bвремени\\b|\\bвременем\\b|\\bвремена\\b|\\bвремён\\b|\\bвременам\\b|\\bвременами\\b|\\bвременах\\b|\\bВремя\\b|\\bВремени\\b|\\bВременем\\b|\\bВремена\\b|\\bВремён\\b|\\bВременам\\b|\\bВременами\\b|\\bВременах\\b]";

        String inpStr = new String(scan.nextLine());

        String delRes = inpStr.replaceAll(pattern, "").replace("  ", " ");
        if (delRes == inpStr) {
            System.out.println("NO");
        } else {
            String[] delResArr = delRes.split("\\s");
            String resStr = new String();

            for (int i = 0; i < delResArr.length; i++) {
                inpStr = inpStr.replaceAll(String.format("\\b%s\\b", delResArr[i]), "");
                if (i == delResArr.length - 1) {
                    resStr = inpStr.replaceAll("  ", " ");
                    String[] resArr = resStr.split("\\s");
                    for (int j = 0; j < resArr.length; j++) {
                        System.out.println(resArr[j].replace(",", ""));
                    }
                }

            }
        }


    }
}