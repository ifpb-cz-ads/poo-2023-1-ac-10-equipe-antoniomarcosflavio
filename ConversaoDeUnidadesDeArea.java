public class ConversaoDeUnidadesDeArea {
    private static final double METRO = 10.76;
    private static final double CENTI = 929;
    private static final double MILHAACRES = 640;
    private static final double ACRE = 43.560;

    public static double metrosParaPes(double metro) {
        double pesQuadrados = metro * METRO;
        return pesQuadrados;
    }

    public static double peParaCentimetro(double pe) {
        double centimetro = pe * CENTI;
        return centimetro;
    }

    public static double milhaParaAcres(double milha) {
        double acres = milha * MILHAACRES;
        return acres;
    }

    public static double acreParaPes(double acre) {
        double pesQuadrados = acre * ACRE;
        return pesQuadrados;
    }
}
