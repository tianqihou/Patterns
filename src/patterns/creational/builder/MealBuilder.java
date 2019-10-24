package patterns.creational.builder;

import patterns.creational.builder.item.burger.ChickenBurger;
import patterns.creational.builder.item.burger.VegBurger;
import patterns.creational.builder.item.colddrink.Coke;
import patterns.creational.builder.item.colddrink.Pepsi;

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
