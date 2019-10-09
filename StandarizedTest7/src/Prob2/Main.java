package Prob2;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		FulltimeTranscriptRecord ftr1 = new FulltimeTranscriptRecord();
		FulltimeTranscriptRecord ftr2 = new FulltimeTranscriptRecord();
		FulltimeTranscriptRecord ftr3 = new FulltimeTranscriptRecord();
		
		SemesterTranscript st1 = new SemesterTranscript();
		st1.insertGrade(3.1);st1.insertGrade(2.8);st1.insertGrade(3.8);st1.insertGrade(4.0);
		SemesterTranscript st2 = new SemesterTranscript();
		st2.insertGrade(3.3);st2.insertGrade(3.8);st2.insertGrade(2.8);st2.insertGrade(3.0);
		SemesterTranscript st3 = new SemesterTranscript();
		st3.insertGrade(3.3);st3.insertGrade(3.8);st3.insertGrade(2.8);st3.insertGrade(3.0);
		SemesterTranscript st4 = new SemesterTranscript();
		st4.insertGrade(3.3);st4.insertGrade(3.8);st4.insertGrade(2.8);st4.insertGrade(3.0);
		SemesterTranscript st5 = new SemesterTranscript();
		st5.insertGrade(3.3);st5.insertGrade(3.8);st5.insertGrade(2.8);st5.insertGrade(3.0);
		SemesterTranscript st6 = new SemesterTranscript();
		st6.insertGrade(3.3);st6.insertGrade(3.8);st6.insertGrade(2.8);st6.insertGrade(3.0);
		
		ftr1.setFallTranscript(st1);
		ftr1.setSpringTranscript(st2);
		ftr2.setFallTranscript(st3);
		ftr2.setSpringTranscript(st4);
		ftr3.setFallTranscript(st5);
		ftr3.setSpringTranscript(st6);
		
		ParttimeTranscriptRecord ptr1 = new ParttimeTranscriptRecord();
		ptr1.insertGrade(1.8);ptr1.insertGrade(2.7);ptr1.insertGrade(3.1);
		ParttimeTranscriptRecord ptr2 = new ParttimeTranscriptRecord();
		ptr2.insertGrade(3.8);ptr2.insertGrade(3.7);
		ParttimeTranscriptRecord ptr3 = new ParttimeTranscriptRecord();
		ptr3.insertGrade(2.3);ptr3.insertGrade(2.7);ptr3.insertGrade(2.1);ptr3.insertGrade(3.9);
		
		FulltimeStudent fts1 = new FulltimeStudent("Bob", ftr1);
		FulltimeStudent fts2 = new FulltimeStudent("Alice", ftr2);
		FulltimeStudent fts3 = new FulltimeStudent("Rick", ftr3);
		
		ParttimeStudent pts1 = new ParttimeStudent("Jonah", ptr1);
		ParttimeStudent pts2 = new ParttimeStudent("Mark", ptr2);
		ParttimeStudent pts3 = new ParttimeStudent("Steve", ptr3);
		
		
		Object[] students = {fts1, fts2, fts3, pts1, pts2, pts3};
		List<Student> studentList = Admin.convertArray(students);
		double averageGpa = Admin.computeAverageGpa(studentList);
		
		//Expected average GPA is 3.1347222222222224
		System.out.println("Average gpa of all students is : " + averageGpa);
	}

}
