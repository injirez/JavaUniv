package com.company.lr7;

import java.util.Scanner;
import java.util.ArrayList;

public class StressTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int a = scan.nextInt();
            String[] list = new String[a + 1];
            for (int i = 0; i < list.length; i++) {
                list[i] = scan.nextLine();
            }

            String answ = scan.nextLine();
            String[] answArr = answ.split(" ");

            ArrayList<Integer> capsArr = new ArrayList<>();
            int counter = 0;
            int capsCounter = 0;

            for (int i = 0; i < answArr.length; i++) {
                String caps = answArr[i].toUpperCase();
                String[] capsLetters = caps.split("");
                String[] letters = answArr[i].split("");

                for (int j = 0; j < letters.length; j++) {
                    if (letters[j].equals(capsLetters[j])) {
                        capsCounter++;

                    }
                    if (j == letters.length - 1) {
                        capsArr.add(capsCounter);
                        capsCounter = 0;
                    }
                }
            }

            for (int i = 0; i < answArr.length; i++) {
                String low = answArr[i].toLowerCase();

                for (int j = 0; j < list.length; j++) {

                    if (!answArr[i].equals(list[j])) {

                        if (answArr[i].equals(low) && j == 1) {
                            counter++;
                        } else if (capsArr.get(i) > 1 && j == 1) {
                            counter++;
                        }
                    }
                }
            }
            System.out.println(counter);


        } catch (Exception e) {
            System.out.println("ERROR!");
        }


    }
}


