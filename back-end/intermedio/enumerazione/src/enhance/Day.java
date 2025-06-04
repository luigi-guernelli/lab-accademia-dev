package enhance;

public enum Day {
    LUNEDI(false), MARTEDI(false), MERCOLEDI(false),
    GIOVEDI(false), VENERDI(false), SABATO(true), DOMENICA(true);

    private final boolean isWeekend;

    Day(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}
