package day02.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day02.aop.entity.Exam;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("day02/aop/setting.xml");
		Exam exam = context.getBean("exam", Exam.class);	// 이름을 명시
//		Exam exam = (Exam) context.getBean("exam");
		
		System.out.printf("total : %d\n", exam.total());
		System.out.printf("avg : %.2f\n", exam.avg());
		
	}

}
