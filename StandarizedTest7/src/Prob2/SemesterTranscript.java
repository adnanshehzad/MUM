package Prob2;

import java.util.ArrayList;
import java.util.List;

public class SemesterTranscript {
	private List<Double> grades = new ArrayList<>();
	public void insertGrade(double val) {
		grades.add(val);
	}
	
	public List<Double> getRecord() {
		return grades;
	}
}
