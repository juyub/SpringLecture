package day01.aisw;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day01.aisw.ui.DisplayExam;

public class Program {

	public static void main(String[] args) {

		//spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("day01/aisw/setting.xml");
//		DisplayExam displayExam = context.getBean(DisplayExam.class);
//		DisplayExam displayExam = (DisplayExam)context.getBean("displayExam");  이렇게도 쓸 수 있음
		
//		displayExam.display();
		
//		AiswExam exam = new AiswExam(10,10,10);
//		InlineDisplayExam displayExam = new InlineDisplayExam();
		
//		GridDisplayExam gridExam = new GridDisplayExam();
		
//		displayExam.setExam(exam);
//		displayExam.display();
		
//		gridExam.setExam(exam);
//		gridExam.display();
		
		List<DisplayExam> displayExams = context.getBean("displayExamList", List.class);

        // Iterate through each DisplayExam in the list and call their display() method
        for (DisplayExam displayExam : displayExams) {
            displayExam.display();
        }
		
	}

}
