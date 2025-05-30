import java.util.Scanner;
/** 3. Somma di due numeri
 * un programma che chiede due numeri e ne stampa la somma
 */
public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int num2= scanner.nextInt();
        int sum= num1+num2;
        System.out.println("La somma è: " + sum);
        scanner.close();
    }
}
