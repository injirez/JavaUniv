//package com.company;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//
//public class LocalMax {
//
//    static int getNumb() {
//        Scanner num = new Scanner(System.in);
//
//        return num.nextInt();
//    }
//
//    public static void main(String[] args) {
//
//        try {
//            ArrayList<Integer> arr = new ArrayList<Integer>();
//            int num = 1;
//            while (num != 0 ) {
//                num = getNumb();
//                arr.add(num);
//            }
//            System.out.println(arr);
//
//        } catch (java.util.InputMismatchException e) {
//            System.out.print("Error");
//        }
//    }
//
//
//}

package com.company;

import java.util.Scanner;

public class LocalMax {
    public static int max = 0;
    public static int counter = 0;
    public static int min = 0;

    static int getNumb() {
        Scanner num = new Scanner(System.in);

        return num.nextInt();
    }

    static int addData() {
        int x = getNumb();
        if (x != 0) {
            addData();
        }
        if (max == x) {
            if (min > counter) {
                min = counter;
            }
            if (min == 0) {
                min = counter;
            }
            counter = 0;
        }
        if (max < x) {
            max = x;
            counter = 0;
        }
        if (max > x) {
            counter++;
        }

        return 0;
    }

    public static void main(String[] args) {

        try {
            addData();
            System.out.print(min + 1);
        } catch (java.util.InputMismatchException e) {
            System.out.print("Error");
        }
    }


}