package livello_intermedio.P2025_00_calcolatrice_semplificata;

import java.util.Scanner;
/**
 * Calcolatrice Semplificata
 *
 * Obiettivo: Calcolare il risultato tra due numeri in base
 * all'operazione scelta (+ - * /)-
 *---------------------------------------------------------------------
 * Chiedi due numeri
 * Chiedi un'operazione usa (String op = scanner.nextLine():)
 * Usa if-else of o switch
 * ---------------------------------------------------------------
 * Attenzione alla divisione per zero!
 */
public class CalcolatriceSemplificata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi il primo numero
        System.out.print("Inserisci il primo numero: ");
        double num1 = scanner.nextDouble();

        // Chiedi il secondo numero
        System.out.print("Inserisci il secondo numero: ");
        double num2 = scanner.nextDouble();

        // Pulisce il buffer
        scanner.nextLine();

        // Chiedi l'operazione
        System.out.print("Inserisci l'operazione (+, -, *, /): ");
        String op = scanner.nextLine();

        double risultato = 0;
        boolean operazioneValida = true;

        // Esegui l'operazione richiesta
        switch(op) {
            case "+":
                risultato = num1 + num2;
                break;
            case "-":
                risultato = num1 - num2;
                break;
            case "*":
                risultato = num1 * num2;
                break;
            case "/":
                if(num2 != 0) {
                    risultato = num1 / num2;
                } else {
                    System.out.println("Errore: divisione per zero!");
                    operazioneValida = false;
                }
                break;
            default:
                System.out.println("Operazione non valida!");
                operazioneValida = false;
        }

        // Stampa il risultato se l'operazione è valida
        if(operazioneValida) {
            System.out.println("Risultato: " + risultato);
        }

        scanner.close();
    }
}
