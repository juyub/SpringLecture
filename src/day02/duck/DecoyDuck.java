package day02.duck;

import day02.duck.fly.FlyWithWings;
import day02.duck.quack.MuteQuack;

public class DecoyDuck extends Duck{
	
	public DecoyDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }
	
	@Override
	public void displayName() {
		
		System.out.println("DecoyDuck");
				
	}

}
