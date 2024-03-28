package org.experis.snack3;

import java.util.Arrays;
import java.util.Random;

public class SumNumber {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int[] numberList = new int[10];

        for (int i = 0; i < 10; i++) {
            int numberRandom = randomGenerator.nextInt(50) +1;
            numberList[i] = numberRandom;
        }
        System.out.println("Lista numeri random: " + Arrays.toString(numberList));

        int sumOddPositions = 0;
        for (int i = 0; i < numberList.length; i++) {
            if (i % 2 != 0) {
                sumOddPositions += numberList[i];
            }
        }

        System.out.println("La somma dei numeri in posizione dispari è: " + sumOddPositions);
    }
}
