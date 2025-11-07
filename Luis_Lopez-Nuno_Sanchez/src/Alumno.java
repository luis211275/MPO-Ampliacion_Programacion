
//CLASE ALUMNO DE LUIS LÓPEZ-NUÑO DAW

public class Alumno {
    //ATRIBUTOS
    private String nombre;
    private double nota_Empleabilidad;
    private double nota_Programacion;
    private double nota_BaseDeDatos;


    //CONSTRUCTOR
    public Alumno(String nombre, double nota_Empleabilidad, double nota_Programacion, double nota_BaseDeDatos) {
        this.nombre = nombre;
        this.nota_Empleabilidad = nota_Empleabilidad;
        this.nota_Programacion = nota_Programacion;
        this.nota_BaseDeDatos = nota_BaseDeDatos;
    }


    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota_Empleabilidad() {
        return nota_Empleabilidad;
    }

    public void setNota_Empleabilidad(double nota_Empleabilidad) {
        this.nota_Empleabilidad = nota_Empleabilidad;
    }

    public double getNota_Programacion() {
        return nota_Programacion;
    }

    public void setNota_Programacion(double nota_Programacion) {
        this.nota_Programacion = nota_Programacion;
    }

    public double getNota_BaseDeDatos() {
        return nota_BaseDeDatos;
    }

    public void setNota_BaseDeDatos(double nota_BaseDeDatos) {
        this.nota_BaseDeDatos = nota_BaseDeDatos;
    }


    //METODO DE CALCULO
    public double calcularNota() {
        double sumatorio = nota_Empleabilidad + nota_Programacion + nota_BaseDeDatos;
        return sumatorio / 3;
    }


    //METODO PARA MOSTRAR INFORMACION
    public void InformacionTotal() {
        System.out.println("===RESUMEN DE NOTAS===");
        System.out.println("Nombre del alumno: " + nombre);
        System.out.println("Nota Empleabilidad: " + nota_Empleabilidad);
        System.out.println("Nota Programacion: " + nota_Programacion);
        System.out.println("Nota BaseDeDatos: " + nota_BaseDeDatos);
        System.out.println("Media de las notas totales: " + calcularNota());
    }
}
