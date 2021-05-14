package com.company.lr7;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class NumOfMatch {
    public static final String FILE = "input.txt";

    public static void main(String[] args) {
        String[] string;
        try {
            Scanner scan = new Scanner(new File(FILE));
            string = scan.nextLine().split(" ");
            ArrayList<Integer> input = new ArrayList<>();
            ArrayList<Integer> inputA = new ArrayList<>();
            for (int i = 0; i < string.length; i++) {
                input.add(Integer.parseInt(string[i]));
            }
            string = scan.nextLine().split(" ");
            for (int i = 0; i < string.length; i++) {
                if (input.contains(Integer.parseInt(string[i])) && !inputA.contains(Integer.parseInt(string[i]))) {
                    inputA.add(Integer.parseInt(string[i]));
                }
            }
            Collections.sort(inputA);
            for (int i = 0; i < inputA.size(); i++) {
                System.out.print(inputA.get(i) + " ");
            }

        } catch (Exception e) {
            System.out.println("ERROR!");
        }

    }
}
