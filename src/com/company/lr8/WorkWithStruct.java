package com.company.lr8;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class WorkWithStruct {
    public static ArrayList<Double> nums = new ArrayList<>();
    public static ArrayList<Integer> counters = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        boolean done = false;
        int counter = 0;
        int i = 0;
        int m = 0;
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        try {
            fh = new FileHandler("output.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

        } catch (Exception e) {
            System.out.println(e);
        }
        while (!done) {
            try {
                getCounter(i);
                done = true;
            } catch (Exception e) {
                String fileName = "data.txt";
                String contents = readFile(fileName);
                String[] cont = contents.split("\n");
                logger.log(Level.WARNING, cont[counters.size() + m], e);
                i = counters.get(counters.size() - 1) + 1;
                m++;
            }

        }

        for (int a = 0; a < nums.size(); a++) {
            if (nums.get(0) < nums.get(a)) {
                counter++;
            }
        }
        writeFile(counter);


    }

    private static String readFile(String fileName) throws IOException {
        Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
        String data = scanner.useDelimiter("\\A").next();
        scanner.close();
        return data;
    }

    private static void writeFile(int value) {
        final int twenty = 20;
        final String three = "3";
        final String four = "4";
        try {
            try {
                String logs = readFile("output.txt");
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt"), "cp1251"));

                String valueStr = Integer.toString(value);
                if (valueStr.equals("2") || valueStr.equals(three) || valueStr.equals(four) || (valueStr.endsWith("2") || valueStr.endsWith(three) || valueStr.endsWith(four)) && value > twenty) {
                    out.append(logs + "\n" + "Давление выходило за пороговое значение - " + value + " раза.");
                } else {
                    out.append(logs + "\n" + "Давление выходило за пороговое значение - " + value + " раз.");
                }

                out.close();
            } catch (Exception e) {
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt"), "cp1251"));

                String valueStr = Integer.toString(value);
                if (valueStr.equals("2") || valueStr.equals(three) || valueStr.equals(four) || (valueStr.endsWith("2") || valueStr.endsWith(three) || valueStr.endsWith(four)) && value > twenty) {
                    out.append("Давление выходило за пороговое значение - " + value + " раза.");
                } else {
                    out.append("Давление выходило за пороговое значение - " + value + " раз.");
                }

                out.close();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getCounter(int a) throws IOException {
        String fileName = "data.txt";
        String contents = readFile(fileName);
        String[] cont = contents.split("\n");


        while (a < cont.length) {
            String numStr = cont[a].replaceAll(":", " ").replaceAll("  ", " ").replaceAll("[a-zA-Z \\u0400-\\u04FF]", "");
            if (numStr.lastIndexOf(".") == numStr.length() - 2) {
                double num = Double.parseDouble(numStr.substring(0, numStr.lastIndexOf(".")));
                nums.add(num);
            } else {
                double num = Double.parseDouble(numStr);
                nums.add(num);
            }
            a++;
            counters.add(a);
        }


    }
}


