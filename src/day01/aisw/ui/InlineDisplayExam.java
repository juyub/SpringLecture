package day01.aisw.ui;

import day01.aisw.entity.Exam;

public class InlineDisplayExam implements DisplayExam {

	private Exam exam;
	
	@Override
	public void display() {
		System.out.printf("Total : %d Average : %.2f\n", exam.total(), exam.avg());
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;		
	}

}
