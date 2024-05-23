package org.lessons.list;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WishList {
    public static void main(String[] args) throws IOException {

        // Creo le variabili
        String userChoice;
        String userPresent;
        boolean goNext = true;

        // Apro lo scanner
        Scanner scanner = new Scanner(System.in);

        // Creo la lista
        ArrayList<String> list = new ArrayList<>();

        // Creo un oggetto file che rappresenta il file dove verranno salvati i regali
        File listText = new File("./resources/data.txt");

        // Creo uno scanner per leggere i regali dal file
        Scanner listReader = new Scanner(listText);

        // Ciclo per leggere le righe del file
        while(listReader.hasNextLine()){

            // Leggo la riga successiva
            String oldLine = listReader.nextLine();

            // Aggiungo la riga letta alla lista
            list.add(oldLine);
        }
        // Chiudo lo scanner
        listReader.close();

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

                // Ordino la lista in ordine alfabetico
                Collections.sort(list);

                // Creo un oggetto FileWriter per scrivere nel file
                FileWriter listWriter = new FileWriter(listText);

                // Ciclo su ogni singolo elemento della lista
                for (String element : list){

                    // Scrivo l'elemento della lista e mando a capo
                    listWriter.write(element + "\n");
                }
                // Chiudo il listWriter
                listWriter.close();

            // Altrimenti
            }else {
                // Esco dal ciclo
                goNext = false;

                // Se la lista non è vuota
                if (!list.isEmpty()){

                    // Mostro a video il resoconto della lista
                    System.out.print(list);
                    System.out.print(" Santa is coming....");
                }
            }
        }

        // Chiudo lo scanner
        scanner.close();
    }
}
