package day02.duck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProgramDuck {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("day02/duck/setting.xml");

		Duck duck = context.getBean("duck", Duck.class);
		duck.displayName();
		duck.performQuack();
		duck.performFly();

//		MallardDuck mallard = context.getBean(MallardDuck.class);
//      mallard.displayName();
//      mallard.performQuack();
//      mallard.performFly();
//        
//      RubberDuck rubber = context.getBean(RubberDuck.class);
//      rubber.displayName();
//      rubber.performQuack();
//      rubber.performFly();
//        
//      DecoyDuck decoy = context.getBean(DecoyDuck.class);
//      decoy.displayName();
//      decoy.performQuack();
//      decoy.performFly();

	}

}
