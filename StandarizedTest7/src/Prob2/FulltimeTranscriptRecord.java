package Prob2;

public class FulltimeTranscriptRecord {
	private SemesterTranscript fallTranscript = new SemesterTranscript();
	private SemesterTranscript springTranscript = new SemesterTranscript();
	public void setFallTranscript(SemesterTranscript fallTranscript) {
		this.fallTranscript = fallTranscript;
	}
	public void setSpringTranscript(SemesterTranscript springTranscript) {
		this.springTranscript = springTranscript;
	}
	public SemesterTranscript getFallTranscript() {
		return fallTranscript;
	}
	public SemesterTranscript getSpringTranscript() {
		return springTranscript;
	}
	
	
	
	

}
