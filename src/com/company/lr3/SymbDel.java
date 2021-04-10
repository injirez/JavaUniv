package com.company.lr3;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

public class SymbDel {



    public static void main(String[] args) {


        Scanner str = new Scanner(System.in);

        String inpStr = str.nextLine();

        String resStr = inpStr.replaceAll("@", "");
        System.out.println(resStr);
    }
}

