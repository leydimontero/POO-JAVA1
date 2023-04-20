import java.util.ArrayList;

public class Pizzeria {
     private ArrayList<Pizza> pizzas = new ArrayList();

     public void agregarPizza(Pizza pizza){
         this.pizzas.add(pizza);
     }

    public void quitarPizza(Pizza pizza){
        this.pizzas.remove(pizza);
    }

    public String mostrarPizzas(){
         String pizzas = "";
        for (Pizza pizza: this.pizzas) {
            pizzas += "\nNombre: " + pizza.getNombre() + "Precio: $" + pizza.calcularPrecio();

        }
        return pizzas;
     }


     // GETTERS AND SETTERS
    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
}
