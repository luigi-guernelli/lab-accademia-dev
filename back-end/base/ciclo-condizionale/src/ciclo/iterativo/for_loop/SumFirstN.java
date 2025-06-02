package ciclo.iterativo.for_loop;

import java.util.Scanner;

/** Esercizio 1.2
 * Somma dei primi N numeri
 */
public class SumFirstN {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci N: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("La somma dei primi " + n + " numeri è: " + sum );
        scanner.close();
    }
}
