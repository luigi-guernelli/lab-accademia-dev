package array_list;
/**
 * Esercizio 6.3: Rimuovi elementi da un ArrayList
 */

import java.util.ArrayList;

public class RemoveFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Prima della rimozione: " + numbers);
        numbers.remove(1); // Rimuove l'elemento in posizione 1 (20)
        System.out.println("Dopo la rimozione: " + numbers);
    }
}