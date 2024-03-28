package org.experis.snack6;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Scrivi i secondi da convertire: ");
        int insertSeconds = scan.nextInt();

        int hours = insertSeconds / 3600;
        int remainingSeconds = insertSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds %60;

        //formattazione del risultato nel formato ore:minuti:secondi
        String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        System.out.println("Tempo convertito " + formattedTime);
    }
}
