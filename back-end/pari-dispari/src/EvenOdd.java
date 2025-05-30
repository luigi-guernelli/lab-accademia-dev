import java.util.Scanner;
/** 4. Controllo pari/dispari
 * un programma che verifica se un numero è pari o dispari
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " è pari.");
        } else {
            System.out.println(num + " è dispari.");
        }
        scanner.close();
    }
}
