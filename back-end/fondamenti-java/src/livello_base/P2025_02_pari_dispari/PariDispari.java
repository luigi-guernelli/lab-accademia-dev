package livello_base.P2025_02_pari_dispari;

import java.util.Scanner;
/**
 * Pari o dispari 
 * Obiettivo: Determinare se un numero inserito dall'utente è
 * pari o dispari.
 *
 * Leggi un numero intero da tastiera Usa l'operatore modulo % per verificare la
 * parità Stampa "Pari" o "Dispari"
 */
public class PariDispari {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("======PARI E DISPARI======");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Il numero è pari: " + numero);
        } else {
            System.out.println("Il numero è dispari: " + numero);
        }
        scanner.close();
    }

}
