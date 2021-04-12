package ru.handh.shool.nsk.zuban;

import java.util.Scanner;

public class IAndeks {
    public static void main(String[] args) {
        String[] array = {"str3", "1smth", "bla2bla"};

        arrayСhanges(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void arrayСhanges(String mass[]) {
        int[] number = new int[mass.length];

        String[] replace = new String[mass.length];

        for (int i = 0; i < mass.length; i++) {
            number[i] = Integer.parseInt(mass[i].replaceAll("[^0-9]", ""));
            replace[i] = mass[i].replaceAll("[^a-zA-Z]+", "");
        }

        for (int i = 0; i < mass.length; i++) {
            mass[number[i] - 1] = replace[i];
        }
    }
}

