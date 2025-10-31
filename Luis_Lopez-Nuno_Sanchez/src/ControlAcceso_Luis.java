public class ControlAcceso_Luis {
    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {

        int edad = PedirEdad(); //Encapsulación
        System.out.println(AnalisisEdad(edad));//Encapsulación
    }


    public static int PedirEdad() {
        boolean salida = true;
        int edad;


        do {
            edad = sc.pedirNumero("Ingrese su edad: ");//Scanner

            if (edad < 0 || edad > 120) {
                System.out.println("Error: Edad no valida.");
                salida = false;

            } else {
                salida = true;

            }


        }
        while (!salida);//control de errrores
        return edad;
    }


    public static String AnalisisEdad(int edad) {
        String mensaje;
        //condicionales
        if (edad < 18) {
            mensaje = "Acceso denegado: Menor de edad.";
        } else if (edad < 65) {
            mensaje = "Acceso permitido.";
        } else {
            mensaje = "Acceso con beneficios para jubilados";
        }
        return mensaje;
    }
}
