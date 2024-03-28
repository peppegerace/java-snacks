package org.experis.snack4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci una parola o una frase: ");
        String input = scan.nextLine();

        String stringConverted = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; i < stringConverted.length() / 2; i++) {
            if (stringConverted.charAt(i) != stringConverted.charAt(stringConverted.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("La stringa inserita è palindorma");
        } else {
            System.out.println("La stringa inserita non è palindroma");
        }

        scan.close();
    }
}
