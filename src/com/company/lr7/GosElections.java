package com.company.lr7;

import java.util.ArrayList;
import java.util.Scanner;

public class GosElections {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            final int number = 450;
            String line;
            String[] input;
            String name;
            ArrayList<Double> scores = new ArrayList<>();
            ArrayList<String> names = new ArrayList<>();
            int counter = 0;
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                input = line.split(" ");

                for (int i = 0; i < input.length; i++) {

                    if (input[i] == input[input.length - 1]) {

                        double score = Double.parseDouble(input[i]);
                        scores.add(score);
                    }
                }

                name = "" + (int) Math.round(scores.get(counter));
                names.add(line.replace(name, ""));
                counter++;

            }

            int sum = 0;

            for (int i = 0; i < scores.size(); i++) {
                sum += scores.get(i);
            }

            for (int i = 0; i < scores.size(); i++) {
                double percent = scores.get(i) / sum;
                double res = percent * number;
//                System.out.println(names.get(i) + Math.round(res));
                System.out.println(names.get(i) + res);
            }
        } catch (Exception e) {
            System.out.println("ERROR!");
        }


    }


}