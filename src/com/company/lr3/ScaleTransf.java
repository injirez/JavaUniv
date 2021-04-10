package com.company.lr3;

import java.util.Scanner;
import java.util.Locale;

public class ScaleTransf {

    public static void main(String[] args) {

        final String pattern = "[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*";
        final int a = 32;
        final int b = 5;
        final int c = 9;
        Scanner str = new Scanner(System.in);

        String inpStr = new String(str.nextLine());

        String delF = inpStr.replaceAll(pattern, "").replace("F", "");
        delF = inpStr.substring(0, delF.length());

        String strF = inpStr.replace(delF, "").replace("F", "").replace(" ", "");
        String strEnd = inpStr.replace(delF, "");

        int dotIndex = strF.lastIndexOf(".");

        strF = strF.substring(0, dotIndex);
        strEnd = strEnd.replace(strF, "").replace("F", "C");

        double dF = Double.parseDouble(strF);
        double dCel = ((dF - a) * b) / c;
        String strC = String.format(Locale.ROOT, "%.2f", dCel);

        String resStr = delF.concat(strC).concat(strEnd);

        System.out.println(resStr);


    }
}

