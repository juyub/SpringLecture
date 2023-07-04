package day01.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day01.hello.entity.HelloWorld;

public class ProgramHello {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("day01/hello/setting.xml");
				
//        HelloWorld helloWorld = context.getBean(HelloWorld.class);
//        helloWorld.sayHello();
        
		HelloWorld helloWorldEn = (HelloWorld) context.getBean("helloWorldEn");
        HelloWorld helloWorldKo = (HelloWorld) context.getBean("helloWorldKo");
        HelloWorld helloWorldFr = (HelloWorld) context.getBean("helloWorldFr");

        helloWorldEn.sayHello();
        helloWorldKo.sayHello();
        helloWorldFr.sayHello();
	}
	
}
