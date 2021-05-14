package com.company.lr5;

import java.util.ArrayList;
import java.util.Scanner;

public class CountSort {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            ArrayList<Integer> listArray = new ArrayList<>();
            int input;
            while (scan.hasNextInt()) {
                input = scan.nextInt();
                listArray.add(input);
            }

            sort(listArray);
        } catch (Exception e) {
            System.out.println("ERROR!");
        }

    }

    public static void sort(ArrayList<Integer> listArray) {
        final double size = Math.pow(2, 105);
        final int hundred = 100;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int element : listArray) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        int[] res = new int[max - min + 1];
        for (int element : listArray) {
            res[element - min]++;
        }
        int arrayIndex = 0;
        for (int i = 0; i < res.length; i++) {
            for (int j = res[i]; j > 0; j--) {
                listArray.set(arrayIndex++, i + min);
            }
        }
        for (int i = 0; i < listArray.size(); i++) {
            if (listArray.get(i) < 0 || listArray.size() > size || listArray.get(i) > hundred) {
                System.out.println("ERROR!");
                break;
            } else {
                System.out.print(listArray.get(i) + " ");
            }
        }
    }

}
