package org.experis.snack2;

import java.util.Random;

public class RandomName {
    public static void main(String[] args) {
        String[] names = {"Antonio", "Alessandro", "Luca", "Giuseppe", "Roberto", "Marco"};
        String[] surnames = {"Cassano", "Del Piero", "Toni", "Rossi", "Baggio", "Tardelli"};
        int fakeGuestList = 20;

        Random randomGenerator = new Random();
        for (int i = 0; i < fakeGuestList; i++) {
            int randomName = randomGenerator.nextInt(names.length);
            int randomSurname = randomGenerator.nextInt(surnames.length);

            System.out.println(names[randomName] + " " + surnames[randomSurname]);
        }

    }
}
