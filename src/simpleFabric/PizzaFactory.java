package simpleFabric;

/**
 * Created by Цымбалюк Сергей on 29.07.2016.
 */
public class PizzaFactory {

    public Pizza getPizza(String type){
        Pizza pizza=null;
        if(type.equalsIgnoreCase("italian")){
            pizza=new ItalianPizza();
        }else if(type.equalsIgnoreCase("chicago")){
            pizza=new ChicagoPizza();
        }else throw new IllegalArgumentException();
        return pizza;
    }
}
