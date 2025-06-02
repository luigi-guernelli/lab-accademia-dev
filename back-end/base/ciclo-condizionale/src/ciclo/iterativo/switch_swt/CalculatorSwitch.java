package ciclo.iterativo.switch_swt;

/**
 * Esercizio 5.1: Calcolatrice con switch
 */
import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci due numeri: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.print("Scegli operazione (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Risultato: " + (a + b));
                break;
            case '-':
                System.out.println("Risultato: " + (a - b));
                break;
            case '*':
                System.out.println("Risultato: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Risultato: " + (a / b));
                } else {
                    System.out.println("Errore: divisione per zero!");
                }
                break;
            default:
                System.out.println("Operazione non valida!");
        }
        scanner.close();
    }
}