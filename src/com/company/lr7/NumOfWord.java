package com.company.lr7;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class NumOfWord {
    public static void main(String[] args) {
        try {
            String fileName = "input.txt";
            String contents = readFile(fileName);
            String[] cont = contents.split("\n");
            Map<String, Integer> occurrences = new HashMap<>();

            for (int i = 0; i < cont.length; i++) {
                for (String word : cont[i].split(" ")) {
                    Integer oldCount = occurrences.get(word);
                    if (oldCount == null) {
                        oldCount = 0;
                    }
                    occurrences.put(word, oldCount + 1);
                    System.out.print(occurrences.get(word) - 1 + " ");
                }
            }

        } catch (Exception e) {
            System.out.println("ERROR");
        }

    }

    private static String readFile(String fileName) throws IOException {
        Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
        String data = scanner.useDelimiter("\\A").next();
        scanner.close();
        return data;
    }
}

