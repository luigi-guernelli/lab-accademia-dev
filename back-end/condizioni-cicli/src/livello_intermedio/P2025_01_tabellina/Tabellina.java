package livello_intermedio.P2025_01_tabellina;
/**
 * Tabellina del numero 5
 *
 * Obiettivo: Stampa la tabellina del numero inserito es: (input = 5 -> 5, 10, 15, ... 50)
 *
 * Leggi il numero.
 * Usa un ciclo for per stampare da numero * 1 a numero * 10.
 */
public class Tabellina {
    public static void main (String[] args) {
        int input = 5; // Variabile inserita di default
      
        System.out.println("=======TABELLINA=======");
        for (int i=1; i<10; i++) {
            int risultato = input * i;
            System.out.println(input + " x " + i + " = " + risultato);
        }
    }
}
