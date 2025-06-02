/** 7. Trova il massimo di un Array
 *  un programma che trova il numero piu grande di un array
 */
public class FindMax {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 8, 3, 20, 7};
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Il numero più grande è " + max);
    }
}
