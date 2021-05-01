package day3hw2;

public class Main {

	public static void main(String[] args) {
		StudentManager sManager = new StudentManager();
		
		Student student = new Student(43, "Kerem Candangil", "kc452", "kerem@kerem.com", 85);
		sManager.add(student);
		student.setName("Kerem CANDANGİL");
		sManager.update(student);
		sManager.delete(student);
		
		InstructorManager iManager = new InstructorManager();
		
		Instructor instructor = new Instructor(35, "Engin Demirog", "engn3506", 
				"engindemirog@gmail.com", 3500, 5.0);
		iManager.add(instructor);
		instructor.setName("Engin DEMIROG");
		iManager.update(instructor);
		iManager.delete(instructor);

	}

}
