public class Grados {
    private static final MyScanner sc = new MyScanner();
    public static void main (String[] args) {

        double grado = sc.pedirDecimal("Ingresa el grado que quieres convertir en F");
        Double F = (grado * 1.8) + 32;
        System.out.println("Resultado final: " + F);

    }
}

