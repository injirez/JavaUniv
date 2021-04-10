package com.company.lr3;

import java.util.Scanner;

public class SpaceRepl {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        String inpStr = str.nextLine();

        String resStr = inpStr.replaceAll("\\s{2,}", "*").replaceAll(" ", "*");

        System.out.println(resStr);
    }
}

