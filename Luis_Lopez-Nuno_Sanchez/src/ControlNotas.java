//CLASE CONTROL DE NOTAS CON EL METODO MAIN LUIS LÓPEZ-NUÑO DAW

public class ControlNotas {
    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {

        //ENCAPSULACIÓN
        Inicio();

        //CERRAR SCANNER
        sc.cerrar();
    }


    //ENCAPSULACIÓN
    public static int Inicio() {

        System.out.println("====CONTROL DE NOTAS====");

        //PEDIR NOTAS Y NOMBRE CON MyScanner
        String nombre = sc.pideTexto("Ingrese el nombre del alumno: ");

        //VALIDED DE ENTRADAS NOTA 1
        double nota_Empleabilidad = sc.pedirDecimal("Introduzca la nota obtenida en empleabilidad: ");
        double nota1 = nota_Empleabilidad;
        boolean resultado_nota1 = false;
        int num = 0;
        do {

            if (0 > nota1 || nota1 > 10) {
                System.out.println("Debes ingresar una nota entre 0 y 10");
                resultado_nota1 = true;
                return num;
            } else {
                resultado_nota1 = false;

            }
        } while (resultado_nota1);

        //VALIDED DE ENTRADAS NOTA 2
        double nota_Programacion = sc.pedirDecimal("Introduzca la nota obtenida en programacion: ");
        double nota2 = nota_Programacion;
        boolean resultado_nota2 = false;
        int num2 = 0;
        do {

            if (0 > nota2 || nota2 > 10) {
                System.out.println("Debes ingresar una nota entre 0 y 10");
                resultado_nota2 = true;
                return num2;
            } else {
                resultado_nota2 = false;

            }
        } while (resultado_nota2);

        //VADILED DE ENTRADAS NOTA 3
        double nota_BaseDeDatos = sc.pedirDecimal("Introduzca la nota obtenida en base de datos: ");
        double nota3 = nota_BaseDeDatos;
        boolean resultado_nota3 = false;
        int num3 = 0;
        do {

            if (0 > nota3 || nota3 > 10) {
                System.out.println("Debes ingresar una nota entre 0 y 10: ");
                resultado_nota3 = true;
                return num3;
            } else {
                resultado_nota3 = false;

            }
        } while (resultado_nota3);


        //CREAR OBJETO alumno
        Alumno alumno = new Alumno(nombre, nota_Empleabilidad, nota_Programacion, nota_BaseDeDatos);

        //MOSTRAR INFORMACION
        alumno.InformacionTotal();


        return 0;
    }
}
