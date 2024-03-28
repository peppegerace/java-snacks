package org.experis.snack5;

import java.util.Scanner;

public class DecomposedString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // prendo il dato dall'utente
        System.out.print("Inserisci una stringa: ");
        String input = scan.nextLine().replaceAll("\\s+", "");

        // inizializzo i contatori per conteggiare il numero di caratteri alfabetici, numerici e simboli
        int alphaCount = 0;
        int numberCount = 0;
        int symbolCount = 0;

        // iterazione attraverso ogni carattere della stringa per contare il numero di caratteri alfabetici, numerici e simboli
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                alphaCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else {
                symbolCount++;
            }
        }

        // Stampo i risultati
        System.out.println("Numero di caratteri alfabetici: " + alphaCount);
        System.out.println("Numero di caratteri numerici: " + numberCount);
        System.out.println("Numero di simboli: " + symbolCount);

        scan.close();
    }
}
