package Karmaka;

public class Fosse {
    private static Fosse fosse;

    private Fosse() {
        super();
    }

    public static Fosse getInstance() {
        if (fosse==null) {
            fosse = new Fosse();
        }
        return fosse;
    }
}
