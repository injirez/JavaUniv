package com.company.lr5;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class MaxSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            HashMap<String, Integer> hm = new HashMap<>();
            ArrayList<String> res = new ArrayList<>();
            int max = 1;
            String temp;
            String name;
            String[] input;

            while (scan.hasNextLine()) {
                name = scan.nextLine();
                input = name.split(" ");
                String schoolNum = input[2];
                if (hm.get(schoolNum) != null) {
                    int count = hm.get(schoolNum);
                    count++;
                    hm.put(schoolNum, count);
                    if (count >= max) {
                        max = count;
                        temp = schoolNum;
                        res.add(temp);
                    }
                } else {
                    hm.put(schoolNum, 1);
                }
            }

            Set<String> set = new HashSet<>(res);
            res.clear();
            res.addAll(set);
            for (int i = 0; i < res.size(); i++) {
                System.out.print(res.get(i) + " ");
            }

        } catch (Exception e) {
            System.out.print("ERROR!");
        }
    }
}