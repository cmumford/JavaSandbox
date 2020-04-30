package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Double> numbers = new ArrayList<Double>();
        for (int i = 0; i < 10; i++) {
            numbers.add(rnd.nextDouble() * 100.0);
        }

        System.out.println(numbers);

        while (!numbers.isEmpty()) {
            int lastIndex = numbers.size()-1;
            System.out.println(numbers.get(lastIndex));
            numbers.remove(lastIndex);
        }
    }
}
