package day02.duck;

import day02.duck.fly.FlyBehavior;
import day02.duck.quack.QuackBehavior;

public class MallardDuck extends Duck{

//	public MallardDuck() {
//        flyBehavior = new FlyWithWings();
//        quackBehavior = new Quack();
//    }
	
	public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}
	
	@Override
	public void displayName() {
			
		System.out.println("MallardDuck");
		
	}
	
}
