package day01.aisw.ui;

import day01.aisw.entity.Exam;

public class GridDisplayExam implements DisplayExam {

	private Exam exam;
	
	@Override
	public void display() {
		
		System.out.println("---------------------");
		System.out.printf("Total   | %d\n", exam.total());
		System.out.printf("Average | %.2f\n", exam.avg());
		System.out.println("---------------------");
		
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;		
	}
	
}
