package BuilderPattern.concretes.domain;

import BuilderPattern.concretes.items.ChickenBurger;
import BuilderPattern.concretes.items.Coke;
import BuilderPattern.concretes.items.Pepsi;
import BuilderPattern.concretes.items.VegBurger;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
