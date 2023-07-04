package day02.duck.quack;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		
		System.out.println("do nothing - cant's quack!");
		
	}

}
