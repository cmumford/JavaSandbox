package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    private static void PrintArray(ArrayList<Integer> array) {

        System.out.print("[");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i));
            if (i < array.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < 15; i++) {
            array.add((int)(Math.random() * 100));
        }

        PrintArray(array);

        Collections.sort(array);

        PrintArray(array);
    }
}
