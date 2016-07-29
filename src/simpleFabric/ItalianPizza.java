package simpleFabric;

/**
 * Created by Цымбалюк Сергей on 29.07.2016.
 */
public class ItalianPizza implements Pizza {
    @Override
    public void addIngredient() {
        System.out.println("add ingredient in Italian pizza");
    }

    @Override
    public void addBox() {
        System.out.println("package in box Italian pizza");
    }
}
