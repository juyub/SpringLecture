package day02.duck;

import day02.duck.fly.FlyBehavior;
import day02.duck.quack.QuackBehavior;

public class RubberDuck extends Duck{
	
//	public RubberDuck() {
//        flyBehavior = new FlyNoWay();
//        quackBehavior = new Squeak();
//    }
	
	public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}
	
	@Override
	public void displayName() {
		
		System.out.println("RubberDuck");
		
	}

}
