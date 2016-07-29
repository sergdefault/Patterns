package simpleFabric;

/**
 * Created by Цымбалюк Сергей on 29.07.2016.
 */
public class main {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new PizzaFactory());
        orderPizza.orderPizza("chicago");
    }
}
