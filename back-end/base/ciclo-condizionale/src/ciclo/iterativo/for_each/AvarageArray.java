package ciclo.iterativo.for_each;

public class AvarageArray {
    public static void main(String[] args) {
        /** doc
         * @param numbers creazione di un array di numeri interi numbers con 5 valori predefiniti
         * @param sum inizializzazione della variabile somma, contenitore di numero
         *
         */
        int[] numbers = {5, 10, 15, 20, 25};
        int sum=0;
        for(int num : numbers) { // all'elemento num vengono assegnati
            sum += num;  // sum conteggia 5 + 10 + 15 + 20 + 25 = 75
        }
        double avarage = (double) sum / numbers.length; // media customizza in double 75 / (divisa) la lunghezza deli array (5)
        System.out.print("La media è: " + avarage);
    }
}
