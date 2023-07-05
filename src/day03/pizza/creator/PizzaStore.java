package day03.pizza.creator;

import day03.pizza.product.Pizza;

public abstract class PizzaStore {
	private Pizza pizza;
    private PizzaStore store;
	
	public Pizza orderPizza() {
		pizza.prepare();
        pizza.makeDough();
        pizza.bake();
        pizza.boxing();
        return pizza;
	}
	
	abstract public Pizza createPizza(String item);

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public void setStore(PizzaStore store) {
		this.store = store;
	}
	
}
