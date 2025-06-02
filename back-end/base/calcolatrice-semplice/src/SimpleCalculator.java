import java.util.Scanner;
/**
 * 8. Calcolatrice semplice
 * un programma che chiede all'utente due numeri e un'operazione
 * (+, -, *, /) e stampa il risultato.
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il primo numero: ");
        double number1 = scanner.nextDouble();

        System.out.print("Inserisci il secondo numero: ");
        double number2 = scanner.nextDouble();

        System.out.print("Scegli un operazione (+, -, *, /, %) ");
        char operation = scanner.next().charAt(0);

        double result = 0;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;

            case '-':
                result = number1 - number2;
                break;

            case '*':
                result = number1 * number2;
                break;

            case '/':
                result = number1 / number2;
                break;

            case '%':
                result = number1 % number2;
                break;

            default:
                System.out.println("Operazione non valida!");
                return;
        }

        System.out.print("Risultato: " + result);
        scanner.close();

    }
}

