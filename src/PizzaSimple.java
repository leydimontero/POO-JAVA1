public class PizzaSimple extends Pizza{

    private double precioBase;
    private boolean estaEnPromocion;

    private final double DESCUENTO_PROMOCION = 10.0;


    @Override
    public double calcularPrecio() {

        if (this.estaEnPromocion == true){
            return this.precioBase - (precioBase / 100 * this.DESCUENTO_PROMOCION);
        }
        return precioBase;
    }


    // GETTERS AND SETTERS
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isEstaEnPromocion() {
        return estaEnPromocion;
    }

    public void setEstaEnPromocion(boolean estaEnPromocion) {
        this.estaEnPromocion = estaEnPromocion;
    }

    public double getDESCUENTO_PROMOCION() {
        return DESCUENTO_PROMOCION;
    }
}
