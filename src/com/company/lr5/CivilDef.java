package com.company.lr5;

import java.util.Scanner;
import java.util.ArrayList;

public class CivilDef {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            final int max = 109;
            ArrayList<Integer> res = new ArrayList<>();
            ArrayList<Integer> min = new ArrayList<>();
            int setlNum = scan.nextInt();
            ArrayList<Integer> setl = new ArrayList<>();
            for (int i = 0; i < setlNum; i++) {
                int a = scan.nextInt();
                setl.add(a);
                res.add(a);
                min.add(max);
            }

            int shelterNum = scan.nextInt();
            ArrayList<Integer> shelter = new ArrayList<>();
            for (int i = 0; i < shelterNum; i++) {
                shelter.add(scan.nextInt());
            }
            for (int i = 0; i < setl.size(); i++) {
                for (int j = 0; j < shelter.size(); j++) {
                    if (Math.abs(setl.get(i) - shelter.get(j)) < min.get(i)) {
                        res.remove(i);
                        min.set(i, Math.abs(setl.get(i) - shelter.get(j)));
                        res.add(i, j + 1);
                    }
                }
            }
            for (int i = 0; i < res.size(); i++) {
                System.out.print(res.get(i) + " ");
            }


        } catch (Exception e) {
            System.out.print("ERROR!");
        }


    }


}