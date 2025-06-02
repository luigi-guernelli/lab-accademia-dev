import java.util.Scanner;
/**
 * 9. Contatore vocali
 * un programma che conta quante vocali contiene una stringa inserita dall'utente.
 */
public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una frase: ");
        String input = scanner.nextLine().toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Numero vocali: " + vowelCount);
        scanner.close();
    }
}
