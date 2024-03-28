package org.experis.snack1;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int insertNumber;
        boolean numberValidate = false;

        while (!numberValidate) {
            System.out.print("inserisci un numero pari compreso tra 10 e 20: ");
            insertNumber = scan.nextInt();

            if (insertNumber >= 10 && insertNumber <= 20 && insertNumber % 2 == 0) {
                numberValidate = true;
                System.out.println("Il numero inserito è: " + insertNumber);
            } else {
                System.out.println("Il numero inserito non è valido. Riprova.");
            }
        }

        scan.close();
    }
}
