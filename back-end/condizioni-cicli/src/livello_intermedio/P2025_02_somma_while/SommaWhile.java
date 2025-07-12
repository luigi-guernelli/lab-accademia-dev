package livello_intermedio.P2025_02_somma_while;

import java.util.Scanner;
/**
 * Somma finchè non si inserisce 0
 * Obiettivo: Sommare tutti i numeri inseriti finchè l'utente non inserisce 0.
 *
 * Usa un ciclo while
 * Continua a leggere numeri e sommarli
 * Ferma il ciclo se l'input è 0
 */
public class SommaWhile {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int somma = 0;
        int numero;

        System.out.println("Inserisci numeri (inserisci 0 per terminare):");

        while (true) {
            numero = scanner.nextInt();
            if (numero == 0) {
                break; // Esci dal ciclo se l'utente inserisce 0
            }
            somma += numero; // Aggiungi il numero alla somma
        }
        System.out.println("La somma dei numeri inseriti è: " + somma);
        scanner.close();
    }
}
