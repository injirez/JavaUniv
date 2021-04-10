package com.company.lr3;

import java.util.Scanner;

public class RepReplac {

    public static void main(String[] args) {
        Scanner strScan = new Scanner(System.in);
        String pattern = "(?i)\\b(\\w+)(?:\\s+\\1\\b)";
        
        String inpStr = new String(strScan.nextLine());
        String resStr = inpStr.replaceAll(pattern, "$1");

        System.out.println(resStr);

    }
}

