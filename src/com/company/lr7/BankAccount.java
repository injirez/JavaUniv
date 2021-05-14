package ru.mai.lr7;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class BankAccount {
    public static final String FILE = "input.txt";
    public static String[] string;
    public static int index = 0;
    public static int bal = 0;
    public static final double HUNDRED = 100.0;
    public static final int THREE = 3;

    public static void main(String[] args) {
        ArrayList<String> listAcc = new ArrayList<>();
        ArrayList<Integer> listMon = new ArrayList<>();
        try {
            Scanner in = new Scanner(new File(FILE));
            while (in.hasNextLine()) {
                string = in.nextLine().split(" ");
                if (string[0].equals("BALANCE")) {
                    if (!listAcc.contains(string[1])) {
                        System.out.println("ERROR");
                    } else {
                        index = listAcc.lastIndexOf(string[1]);
                        bal = listMon.get(index);
                        System.out.println(bal);
                    }
                }
                if (string[0].equals("DEPOSIT")) {
                    if (!listAcc.contains(string[1])) {
                        listAcc.add(string[1]);
                        listMon.add(Integer.parseInt(string[2]));
                        bal = listMon.get(index);
                    } else {
                        index = listAcc.lastIndexOf(string[1]);
                        bal = listMon.get(index);
                        listMon.set(index, Integer.parseInt(string[2]) + bal);
                        bal = listMon.get(index);
                    }
                }
                if (string[0].equals("WITHDRAW")) {
                    if (!listAcc.contains(string[1])) {
                        listAcc.add(string[1]);
                        listMon.add(0 - Integer.parseInt(string[2]));
                        bal = listMon.get(index);
                    } else {
                        index = listAcc.lastIndexOf(string[1]);
                        bal = listMon.get(index);
                        listMon.set(index, bal - Integer.parseInt(string[2]));
                        bal = listMon.get(index);
                    }
                }
                if (string[0].equals("TRANSFER")) {
                    if (!listAcc.contains(string[1])) {
                        listAcc.add(string[1]);
                        listMon.add(0 - Integer.parseInt(string[THREE]));
                        bal = listMon.get(index);
                    } else {
                        index = listAcc.lastIndexOf(string[1]);
                        bal = listMon.get(index);
                        listMon.set(index, bal - Integer.parseInt(string[THREE]));
                        bal = listMon.get(index);
                    }
                    if (!listAcc.contains(string[2])) {
                        listAcc.add(string[2]);
                        listMon.add(0 + Integer.parseInt(string[THREE]));
                        bal = listMon.get(index);
                    } else {
                        index = listAcc.lastIndexOf(string[2]);
                        bal = listMon.get(index);
                        listMon.set(index, bal + Integer.parseInt(string[THREE]));
                        bal = listMon.get(index);
                    }
                }
                if (string[0].equals("INCOME")) {
                    for (int i = 0; i < listAcc.size(); i++) {
                        if (listMon.get(i) > 0) {
                            listMon.set(i, listMon.get(i) + (int) Math.floor(
                                    listMon.get(i) / HUNDRED * Integer.parseInt(string[1])));
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid Data!");
        }
    }
}

