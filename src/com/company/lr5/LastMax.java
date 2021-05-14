package com.company.lr5;

import java.util.Scanner;
import java.util.ArrayList;

public class LastMax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            ArrayList<Integer> inpList = new ArrayList<>();
            int input;
            int max = 0;

            while (scan.hasNextInt()) {
                input = scan.nextInt();
                inpList.add(input);
            }

            for (int i = 0; i < inpList.size(); i++) {
                if (max < inpList.get(i)) {
                    max = inpList.get(i);
                }
            }

            System.out.print(max + " " + inpList.lastIndexOf(max));

        } catch (Exception e) {
            System.out.print("ERROR!");
        }


    }


}