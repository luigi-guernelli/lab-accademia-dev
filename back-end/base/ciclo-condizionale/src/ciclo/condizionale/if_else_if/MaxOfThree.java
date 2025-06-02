package ciclo.condizionale.if_else_if;
/**
 * Esercizio 3.2: Trova il maggiore tra tre numeri
 */
import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci tre numeri: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.print("Il maggiore è: " + max);
        scanner.close();
    }
}
