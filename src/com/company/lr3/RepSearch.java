package com.company.lr3;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inpStr = scan.nextLine();
        Matcher m = Pattern.compile("\\b(\\w+)\\s+\\1\\b").matcher(inpStr);
        while (m.find()) {
            for (int i = 1; i <= m.groupCount(); i++) {
                System.out.println(m.group(i));
            }
        }
    }
}