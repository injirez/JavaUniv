package com.company.lr7;

import java.util.Scanner;
import java.util.ArrayList;

public class PhoneNumbers {

    public static void main(String[] args) {

        try {
            final String code = "495";
            Scanner scan = new Scanner(System.in);
            ArrayList<String> inpList = new ArrayList<>();
            String line;
            String[] input;
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                input = line.split(" ");
                for (int i = 0; i < input.length; i++) {
                    String number = input[i].replaceAll("-", "").replaceAll("\\(", "").replaceAll("\\+", "").replaceAll("\\)", "").replaceFirst("7", "8").replaceFirst("8", "");

                    if (number.length() == 10)  {
                        number = number.substring(0, 3);
                        inpList.add(number);
                    } else if (!number.substring(1,  4).equals("495") || !number.substring(1,  4).equals("916")){
                        number = code + number;
                        number = number.substring(0, 3);
                        inpList.add(number);
                    }

                }
            }
            for (int i = 0; i < inpList.size(); i++) {
                System.out.println(inpList.get(i));
            }

        } catch (Exception e) {
            System.out.println("ERROR!");
        }

    }
}
