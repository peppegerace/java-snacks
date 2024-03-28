package org.experis.snack2;

import java.util.Random;

public class RandomName {
    public static void main(String[] args) {
        String[] names = {"Antonio", "Alessandro", "Luca", "Giuseppe", "Roberto", "Marco"};
        String[] surnames = {"Cassno", "Del Piero", "Toni", "Rossi", "Baggio", "Tardelli"};

        Random randomGenerator = new Random();
        int randomName = randomGenerator.nextInt(names.length);
        int randomSurname = randomGenerator.nextInt(surnames.length);

        System.out.println(names[randomName] + " " + surnames[randomSurname]);
    }
}
