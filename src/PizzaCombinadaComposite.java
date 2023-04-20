import java.util.ArrayList;

public class PizzaCombinadaComposite extends Pizza {

    private ArrayList<Pizza> pizzas = new ArrayList();

    public void agreagarPizza (Pizza pizza){
        this.pizzas.add(pizza);
    }

    public void quitarPizza(Pizza pizza){
        this.pizzas.remove(pizza);
    }


    @Override
    public double calcularPrecio() {
        double precioTotal = 0.0;
       for (int i=0; i < pizzas.size(); i++){
           if (precioTotal > pizzas.get(i).calcularPrecio()){
               precioTotal = pizzas.get(0).calcularPrecio();
           }
           else {
               precioTotal = pizzas.get(i).calcularPrecio();
           }
       }
        return precioTotal;
    }
}
