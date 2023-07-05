package day03.pizza;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day03.pizza.creator.NYPizzaStore;
import day03.pizza.creator.PizzaStore;
import day03.pizza.product.Pizza;

public class PizzaMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("day03/pizza/setting.xml");

		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.createPizza("cheese");
		pizza.orderPizza();
		pizza.displayName();
		
//		PizzaStore cheese = context.getBean("cheese", PizzaStore.class);
//        Pizza pizza = cheese.orderPizza();
//        pizza.displayName();
		
	}
	
}
