public class PizzaFactoryMethodSingleton {

    private static PizzaFactoryMethodSingleton instancia = new PizzaFactoryMethodSingleton();

    // CONSTRUCTOR PRIVATE
    private PizzaFactoryMethodSingleton() { }


    public static PizzaFactoryMethodSingleton obtenerInstancia(){
        return PizzaFactoryMethodSingleton.instancia;

    }

    public Pizza crearPizza(String tipo){
        switch (tipo.toUpperCase()){
            case "SIMPLE":
                return new PizzaSimple();
            case "COMBINADA":
                return new PizzaCombinadaComposite();
        }
        return null;

    }
}
