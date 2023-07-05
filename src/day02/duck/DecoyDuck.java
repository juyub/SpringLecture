package day02.duck;

import day02.duck.fly.FlyBehavior;
import day02.duck.quack.QuackBehavior;

public class DecoyDuck extends Duck{
	
//	public DecoyDuck() {
//        flyBehavior = new FlyWithWings();
//        quackBehavior = new MuteQuack();
//    }
	
	public DecoyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}
	
	@Override
	public void displayName() {
		
		System.out.println("DecoyDuck");
				
	}

}
