package day02.duck.fly;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {

		System.out.println("do nothing - cant's fly!");
		
	}
	
}
