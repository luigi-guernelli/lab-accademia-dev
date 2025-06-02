package array;

/** 6. Array e ArrayList
 * Esercizio 6.1: Trova il minimo in un array
 */
public class MinArray {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 9, 1, 5}; // valori predefiniti
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) min = num;
        }
        System.out.println("Il minimo è: " + min);
    }
}
