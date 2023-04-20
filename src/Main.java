public class Main {
    public static void main(String[] args) {

        PizzaFactoryMethodSingleton pizzeria = PizzaFactoryMethodSingleton.obtenerInstancia();

        PizzaSimple pizzaDeMozzarella = (PizzaSimple) pizzeria.crearPizza("SIMPLE");
        pizzaDeMozzarella.setNombre("Pizza de Mozzarella");
        pizzaDeMozzarella.setPrecioBase(700);
        pizzaDeMozzarella.setEstaEnPromocion(true);
        System.out.println("Precio: " + pizzaDeMozzarella.calcularPrecio());

        PizzaSimple pizzaEspecial = (PizzaSimple) pizzeria.crearPizza("SIMPLE");
        pizzaEspecial.setNombre("Pizza de Mozzarella");
        pizzaEspecial.setPrecioBase(850);
        pizzaEspecial.setEstaEnPromocion(true);
        System.out.println("Precio: " + pizzaEspecial.calcularPrecio());


        PizzaSimple pizzaDeAnana = (PizzaSimple) pizzeria.crearPizza("SIMPLE");
        pizzaDeAnana.setNombre("Pizza de Ananá");
        pizzaDeAnana.setPrecioBase(950);
        pizzaDeAnana.setEstaEnPromocion(false);
        System.out.println("Precio: " + pizzaDeAnana.calcularPrecio());

        PizzaCombinadaComposite pizzaLoca = (PizzaCombinadaComposite) pizzeria.crearPizza("COMBINADA");
        pizzaLoca.setNombre("Pizza Loca");
        pizzaLoca.agreagarPizza(pizzaDeMozzarella);
        pizzaLoca.agreagarPizza(pizzaDeAnana);
        System.out.println("Precio: " + pizzaLoca.calcularPrecio());

        Pizzeria pizzeria1 = new Pizzeria();
        pizzeria1.agregarPizza(pizzaDeMozzarella);
        pizzeria1.agregarPizza(pizzaDeAnana);
        pizzeria1.agregarPizza(pizzaLoca);
        pizzeria1.mostrarPizzas();



    }
}