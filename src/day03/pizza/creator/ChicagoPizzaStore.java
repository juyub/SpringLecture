package day03.pizza.creator;

import day03.pizza.product.ChicagoCheesePizza;
import day03.pizza.product.ChicagoVegPizza;
import day03.pizza.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {
		
		if (item.equals("cheese")) {
			return new ChicagoCheesePizza();
		} else if (item.equals("veg")) {
			return new ChicagoVegPizza();
		} else return null;
	}
	
}
