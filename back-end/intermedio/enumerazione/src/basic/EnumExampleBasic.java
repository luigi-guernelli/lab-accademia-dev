package basic;
/** 1. Enum
 * Esercizio 1.1: Giorni della settimana
 * Crea un enum per i giorni della settimana e stampa un messaggio in base al giorno
 */
public class EnumExampleBasic {
    public static void main(String[] args) {
        Day today = Day.MERCOLEDI; // GIOVEDI giorni lavorativi

        switch (today) {
            case LUNEDI:
                System.out.println("Oggi è lunedì!");
                break;
            case VENERDI:
                System.out.println("Venerdì ultimo giorno di lavoro!");
                break;
            case SABATO:
            case DOMENICA:
                System.out.println("Weekend e relax!");
                break;
            default:
                System.out.println("Giorno lavorativo...");
        }
    }
}
