package day03.pizza.creator;

import day03.pizza.product.NYCheesePizza;
import day03.pizza.product.NYVegPizza;
import day03.pizza.product.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {

		if (item.equals("cheese")) {
			return new NYCheesePizza();
		} else if (item.equals("veg")) {
			return new NYVegPizza();
		} else return null;
		
	}
	
}
