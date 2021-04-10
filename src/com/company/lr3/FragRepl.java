package com.company.lr3;

import java.util.Scanner;

public class FragRepl {

    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);

        String inpStr = str.nextLine();

        String capStr = inpStr.replaceAll("h", "H");

        int firstInd = inpStr.indexOf("h");
        int lastInd = inpStr.lastIndexOf("h");

        StringBuilder resStr = new StringBuilder(capStr);
        resStr = resStr.replace(firstInd, firstInd + 1, "h");
        resStr = resStr.replace(lastInd, lastInd + 1, "h");
        System.out.println(resStr);
    }
}

