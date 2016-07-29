package simpleFabric;

/**
 * Created by Цымбалюк Сергей on 29.07.2016.
 */
public class ChicagoPizza implements Pizza {
    @Override
    public void addIngredient() {
        System.out.println("add ingredient in Chicago pizza");
    }

    @Override
    public void addBox() {
        System.out.println("put in e box Chicago pizza");
    }
}
