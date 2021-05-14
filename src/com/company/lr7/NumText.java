package com.company.lr7;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class NumText {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            ArrayList<String> inpList = new ArrayList<>();
            String line;
            String[] input;
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                input = line.split(" ");
                for (int i = 0; i < input.length; i++) {
                    inpList.add(input[i]);
                }
            }

            Set<String> set = new HashSet<>(inpList);
            inpList.clear();
            inpList.addAll(set);

            System.out.println(inpList.size());
        } catch (Exception e) {
            System.out.println("ERROR!");
        }

    }
}
