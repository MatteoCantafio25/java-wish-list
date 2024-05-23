package org.lessons.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WishList {
    public static void main(String[] args) {

        // Creo le variabili
        String userChoice;
        String userPresent;
        boolean goNext = true;

        // Apro lo scanner
        Scanner scanner = new Scanner(System.in);

        // Creo la lista
        ArrayList<String> list = new ArrayList<>();

        // Ciclo finchè l'utente vuole andare avanti
        while (goNext){
            // Chiedo all'utente se vuole inserire un regalo o uscire
            System.out.print("Enter 1 if you want to add a present, 2 if you want to exit ");
            userChoice = scanner.nextLine();

            // Se la risposta è 1
            if (userChoice.equals("1")){
                // Chiedo che regalo vuole inserire
                System.out.print("What present you want to add? ");
                userPresent = scanner.nextLine();

                // Aggiungo il regalo alla lista
                list.add(userPresent);

                // Mostro a video la lunghezza della lista
                System.out.println("Presents: " + list.size());

            // Altrimenti
            }else {
                // Esco dal ciclo
                goNext = false;

                // Ordino la lista in ordine alfabetico
                Collections.sort(list);

                // Mostro a video il resoconto della lista
                System.out.print(list);
                System.out.print(" Santa is coming....");
            }
        }

        // Chiudo lo scanner
        scanner.close();
    }
}
