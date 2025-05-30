import java.util.Scanner;
/** 2.Input-Output
 * Un programma che chiede all'utente il nome è lo saluta
 */
public class GreetUser {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String name = scanner.nextLine();
        System.out.print("Ciao, " + name + "!");
        scanner.close();
    }
}
