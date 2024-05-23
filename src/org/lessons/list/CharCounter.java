package org.lessons.list;
import java.util.HashMap;
import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        // Creo una variabile
        String userWord;

        // Creo lo scanner
        Scanner scanner = new Scanner(System.in);

        // Chiedo una parola all'utente
        System.out.print("Enter a word: ");
        userWord = scanner.nextLine();

        // Divido la parola in un array di stringhe
        String[] wordChars = userWord.split("");

        // Creo un map per tenere il conto dei singoli caratteri
        HashMap<String, Integer> result = new HashMap<>();

        // Ciclo sull'array wordChars
        for (String singleChar : wordChars) {

            // Se il map non contiene ancora il singolo carattere
            if (!result.containsKey(singleChar)) {

                // Aggiungo al map il singolo carattere come chiave, con valore 1
                result.put(singleChar, 1);

              // Altrimenti
            } else {

                // Aggiungo al map il singolo carattere come chiave e aggiungo al conteggio corrente + 1 come valore
                result.put(singleChar, result.get(singleChar) + 1);
            }
        }
        // Stampo il map
        System.out.println(result);

        scanner.close();
    }
}
