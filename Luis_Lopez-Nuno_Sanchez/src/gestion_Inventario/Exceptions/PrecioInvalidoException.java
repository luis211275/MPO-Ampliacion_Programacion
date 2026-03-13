package gestion_Inventario.Exceptions;

public class PrecioInvalidoException extends Exception {
    private final double precioIntroducido;
    private final double precioMinimo;
    private final double precioMaximo;
    private final double precioSocio;

    public PrecioInvalidoException(double precioIntroducido, double precioMinimo, double precioMaximo, double precioSocio) {
        this.precioIntroducido = precioIntroducido;
        this.precioMinimo = precioMinimo;
        this.precioMaximo = precioMaximo;
        this.precioSocio = precioSocio;
    }

    @Override
    public String getMessage() {
        if (precioIntroducido < 0){
            return "El cantidad introducida debe ser mayor a 0";
        }else if (precioIntroducido == 50.0){
            return "El precio introducido por politicas de la empresa no puede ser 50";
        }else if (precioIntroducido < precioSocio){
            return "El precio introducido base no puede ser mas barato que el precio del asociado";
        }
        return "El precio tiene que estar entre" + precioMinimo + " y " + precioMaximo;
    }
}
