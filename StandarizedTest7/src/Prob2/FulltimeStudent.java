package Prob2;

import java.util.List;

public class FulltimeStudent extends Student {
	private String name;
	private FulltimeTranscriptRecord record;
	public FulltimeStudent(String name, FulltimeTranscriptRecord record) {
		this.name = name;
		this.record = record;
	}
	
	public double computeGpa() {
		List<Double> fallGrades = record.getFallTranscript().getRecord();
		List<Double> springGrades = record.getSpringTranscript().getRecord();
		if(fallGrades.isEmpty() && springGrades.isEmpty()) return 0.0;
		double sum = 0.0;
		for(Double d : fallGrades) {
			sum += d.doubleValue();
		}
		for(Double d : springGrades) {
			sum += d.doubleValue();
		}
		return sum / (fallGrades.size() + springGrades.size());
	}
	public String getName() {
		return name;
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof FulltimeStudent)) return false;
		FulltimeStudent fts = (FulltimeStudent)ob;
		return name.equals(fts.name);
	}
	
	public String toString() {
		return name;
	}
}
