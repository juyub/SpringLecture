package day02.duck;

import day02.duck.fly.FlyNoWay;
import day02.duck.quack.Squeak;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
	
	@Override
	public void displayName() {
		
		System.out.println("RubberDuck");
		
	}

}
