package day3hw2;

public class Student extends User {
	private int grade;
	
	public Student(int id, String name, 
			String password, String email, int grade) {
		super(id, name, password, email);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}	
}