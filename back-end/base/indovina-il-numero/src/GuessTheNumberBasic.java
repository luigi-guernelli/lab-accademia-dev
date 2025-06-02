import java.util.Random;
import java.util.Scanner;

/**
 * 10. Gioco. "Indovina il numero"
 */
public class GuessTheNumberBasic {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("Indovina il numero tra 1 e 100!");

        do {
            System.out.print("Inserisci la tua ipotesi: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Troppo basso!");
            } else if (guess > targetNumber) {
                System.out.println("Troppo alto!");
            }

        } while (guess != targetNumber && attempts < maxAttempts);

        if (attempts >= maxAttempts) {
            System.out.println("Hai perso! Il numero era " + targetNumber);
        } else {
            System.out.println("Bravo! Hai indovinato in " + attempts + " tentativi.");
        }

        scanner.close();
    }
}