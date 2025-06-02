import java.util.Random;
import java.util.Scanner;

/**
 * 10.1 Gioco. "Indovina il numero"
 */
public class GuessTheNumberEnhanced {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess=1;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("=== INDOVINA IL NUMERO (1-100) ===");
        System.out.println("Hai " + maxAttempts + " tentativi per indovinare!");

        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        do {
            System.out.print("\nTentativo #" + (attempts + 1) + " - Inserisci un numero: ");

            if (!scanner.hasNextInt()) {
                System.out.println("ERRORE: Inserisci solo numeri interi!");
                scanner.next();
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Il numero deve essere tra 1 e 100!");
                attempts--;
                continue;
            }

            if (guess < targetNumber) {
                System.out.println("Troppo basso! Tentativi rimasti: " + (maxAttempts - attempts));
            } else if (guess > targetNumber) {
                System.out.println("Troppo alto! Tentativi rimasti: " + (maxAttempts - attempts));
            }

        } while (guess != targetNumber && attempts < maxAttempts);

        if (guess == targetNumber) {
            System.out.println( nome + " BRAVO! Hai indovinato in " + attempts + " tentativi!");
        } else {
            System.out.println(nome + " Hai perso! Il numero era: " + targetNumber);
        }

        scanner.close();
    }
}