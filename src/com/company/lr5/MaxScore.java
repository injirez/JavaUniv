package com.company.lr5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MaxScore {


    public static void main(String[] args) {
        try {

            final int nine = 9;
            final int ten = 10;
            final int eleven = 11;
            final int hundred = 100;
            final int three = 3;
            int error = 0;
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> nineClass = new ArrayList<>();
            ArrayList<Integer> tenClass = new ArrayList<>();
            ArrayList<Integer> elevenClass = new ArrayList<>();
            String name;
            String[] input;

            while (scanner.hasNextLine()) {
                name = scanner.nextLine();
                input = name.split(" ");
                if (Integer.parseInt(input[three]) > hundred) {
                    error = 1;
                }
                if (Integer.parseInt(input[2]) > eleven || Integer.parseInt(input[2]) < nine) {
                    error = 1;
                }

                if (Integer.parseInt(input[2]) == nine) {
                    nineClass.add(Integer.parseInt(input[three]));
                }
                if (Integer.parseInt(input[2]) == ten) {
                    tenClass.add(Integer.parseInt(input[three]));
                }
                if (Integer.parseInt(input[2]) == eleven) {
                    elevenClass.add(Integer.parseInt(input[three]));
                }
            }

            Collections.sort(nineClass);
            Collections.sort(tenClass);
            Collections.sort(elevenClass);
            if (error == 0) {
                System.out.print(nineClass.get(nineClass.size() - 1) + " ");
                System.out.print(tenClass.get(tenClass.size() - 1) + " ");
                System.out.print(elevenClass.get(elevenClass.size() - 1) + " ");
            } else if (error == 1) {
                System.out.println("ERROR!");
            }

        } catch (Exception e) {
            System.out.println("ERROR!");
        }

    }
}
