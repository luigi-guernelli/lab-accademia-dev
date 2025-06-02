package ciclo.condizionale.if_else_if;
/**
 * 3. if / else-if
 * Esercizio 3.1: Verifica se un numero è positivo, negativo o zero
 */

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.print("Negativo");
        } else {
            System.out.println("Zero");
        }
        scanner.close();
    }
}
