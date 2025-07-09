package livello_base.P2025_01_somma;

import java.util.Scanner;
/**
 * Somma di due numeri
 * Obiettivo: Leggere due numeri da tastiera e stamparne la somma
 * Utilizzo di Scanner per leggere due int Somma i numeri Stampa il risultato
 */
public class SommaDueNumeri {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("===SOMMA DI DUE NUMERI!======");

        System.out.print("Inserisci il primo numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int numero2 = scanner.nextInt();

        int somma = numero1 + numero2;
        System.out.println("La somma dei due numeri è: " + somma);

        scanner.close();

    }

}
