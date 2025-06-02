package ciclo.iterativo.do_while;
/** 4. Ciclo do-while
 * Esercizio 4.1: Chiedi un numero finchè non è positivo
 */

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Inserisci un numero positivo: ");
            num = scanner.nextInt();
        } while (num <= 0);
        System.out.print("Hai inserito: " + num);
        scanner.close();
    }
}
