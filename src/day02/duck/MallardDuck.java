package day02.duck;

import day02.duck.fly.FlyWithWings;
import day02.duck.quack.Quack;

public class MallardDuck extends Duck{

	public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
	
	@Override
	public void displayName() {
			
		System.out.println("MallardDuck");
		
	}
	
}
