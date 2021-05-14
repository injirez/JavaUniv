package com.company.lr7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;

public class NumOfDiff {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int input;
            ArrayList<Integer> inpList = new ArrayList<>();
            while (scan.hasNextInt()) {
                input = scan.nextInt();
                inpList.add(input);
            }

            System.out.println(uniqueCount(inpList));
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
    }

    public static int uniqueCount(ArrayList<Integer> array) {

        Set<Integer> set = new HashSet<>(array);
        array.clear();
        array.addAll(set);
        return array.size();
    }

}