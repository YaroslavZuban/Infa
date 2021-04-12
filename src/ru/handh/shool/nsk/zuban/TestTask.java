package ru.handh.shool.nsk.zuban;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер матрицы: ");
        int n = scanner.nextInt();

        while (n < 0) {
            System.out.print("Введите n больше нуля: ");
            n = scanner.nextInt();
        }

        creatingArrays(n);
    }

    public static void creatingArrays(int size) {
        ArrayList<double[]> allArrays = new ArrayList<double[]>();

        for (int i = 0; i < size; i++) {
            allArrays.add(fillingArray());
        }

        for (double[] allArray : allArrays) {
            if (allArray.length % 2 == 0) {
                Arrays.sort(allArray);
            } else {
                bubbleSort(allArray);
            }

            System.out.println(Arrays.toString(allArray));
        }
    }

    static double[] fillingArray() {
        Random random = new Random();

        double[] mass = new double[random.nextInt(20 + 1)];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = Math.random() * 200;
        }

        return mass;
    }

    static void bubbleSort(double[] array) {
        boolean isSorted = true;
        double temp;

        while (isSorted) {
            isSorted = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = true;
                }
            }
        }
    }
}
