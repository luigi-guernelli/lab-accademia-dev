package enhance;
/**
 * Esercizio 1.2: Enum con metodi e attributi
 * Aggiungi un attributo isWeekend e un metodo isWeekend() all'enum Day.
 */
public class EnumWithMethods {
    public static void main(String[] args) {
        Day day = Day.SABATO;
        System.out.println(day + " è weekend? " + day.isWeekend());
    }
}
