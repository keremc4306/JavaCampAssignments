package day3hw2;

public class Instructor extends User {
	private int numOfStudent;
	private double score;
	
	public Instructor(int id, String name, String password, String email, 
			int numOfStudents, double score) {
		super(id, name, password, email);
		this.numOfStudent = numOfStudents;
		this.score = score;
	}

	public int getNumOfStudent() {
		return numOfStudent;
	}

	public void setNumOfStudent(int numOfStudent) {
		this.numOfStudent = numOfStudent;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}