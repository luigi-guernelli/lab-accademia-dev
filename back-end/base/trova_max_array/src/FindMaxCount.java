import java.util.Scanner;

public class FindMaxCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedere all'utente quanti numeri vuole inserire
        System.out.print("Quanti numeri vuoi inserire? ");
        int count = scanner.nextInt();

        // Crea l'array della dimensione specificata
        int[] numbers = new int[count];

        // Riempire l'array con i numeri inseriti dall'utente
        for (int i = 0; i < count; i ++) {
            System.out.print("Inserisci il numero " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Trova il massimo
        int max = numbers [0];
        for (int num: numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Il numero piu grande è: " + max);
        scanner.close();

    }
}
