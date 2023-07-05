package day03.pizza.product;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;
	String dough;
	String cheese;
	List<String> toppings = new ArrayList<String>();
	
	public abstract void displayName();
	
	public void prepare() {
		System.out.println("준비중" + " " + name);
	}
	
	public void makeDough() {
		System.out.println("도우너 제작중");
	}
	
	public void bake() {
		System.out.println("굽는중");
	}
	
	public void boxing() {
		System.out.println("포장중");
	}

	public void orderPizza() {
		prepare();
        makeDough();
        bake();
        boxing();
		System.out.println("주문됨");
	}
	
}
