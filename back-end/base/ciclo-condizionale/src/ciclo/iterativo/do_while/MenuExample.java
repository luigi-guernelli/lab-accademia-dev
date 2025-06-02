package ciclo.iterativo.do_while;
/**
 * Esercizio 4.2: Menu interattivo con do-while
 */

import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Saluta");
            System.out.println("2. Stampa numeri da 1 a 5");
            System.out.println("3. Esci");
            System.out.print("Scelta: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("---------------------------------- \n");
                    System.out.println("Ciao!");
                    System.out.print("---------------------------------- \n");
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("---------------------------------- \n");
                        System.out.println(i);
                        System.out.print("---------------------------------- \n");
                    }
                    break;
                case 3:
                    System.out.print("---------------------------------- \n");
                    System.out.println("Uscita...");
                    System.out.print("---------------------------------- \n");
                    break;
                default:
                    System.out.print("---------------------------------- \n");
                    System.out.println("Scelta non valida!");
                    System.out.print("---------------------------------- \n");
            }
        } while (choice != 3);
        scanner.close();
    }
}