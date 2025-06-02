import java.util.Scanner;
/** 6. Stampa numeri da 1 a N
 *  un programma che stampa tutti i numeri da 1 a N usando un ciclo while
 */
public class PrintNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero (N): ");
        int numero = scanner.nextInt();
        int i = 1;
        while (i<= numero) {
            System.out.println(i);
            i++;
        }
        scanner.close();
    }
}
