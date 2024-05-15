package handson3;

public class Education {
	private String degree;
	private String course;
	private String subject;
	public Education(String degree, String course, String subject){
		super();
		this.degree = degree;
		this.course = course;
		this.subject = subject;
	}
	public String show(){
		return degree + " " +course + " " +subject;
	}
	

}
