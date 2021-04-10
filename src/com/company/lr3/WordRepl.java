package com.company.lr3;

import java.util.Scanner;

public class WordRepl {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        StringBuilder inpStr = new StringBuilder(str.nextLine());
        StringBuilder inpStrCop = new StringBuilder(inpStr);

        int spaceInd = inpStr.indexOf(" ");

        StringBuilder firstWord = inpStr.replace(spaceInd, inpStr.length(), "");
        StringBuilder secondWord = inpStrCop.replace(0, spaceInd + 1, "");

        StringBuilder resStr = new StringBuilder();
        resStr.append(secondWord).append(" ").append(firstWord);

        System.out.println(resStr);

    }
}

