import java.util.Scanner;
/** 5. Calcolo fattoriale
 * un programma che calcola il fattoriale di un numero usando un ciclo for.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int number = scanner.nextInt();
        int factorial=1;
        for (int i=1; i <=number; i++) {
            factorial *= i;
        }
        System.out.println("Il fattoriale di " + number + " è: " + factorial);
    }
}
