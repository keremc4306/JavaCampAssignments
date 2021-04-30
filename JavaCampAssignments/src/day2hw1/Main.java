package day2hw1;

public class Main {

	public static void main(String[] args) {
		CategoryManager ctgManager = new CategoryManager(); //CategoryManager s�n�f�ndan ctgManager ad�nda nesne olu�turdum.
		
		System.out.println("Instructors:");
		
		Instructor i1 = new Instructor(100, "Utku", "�elik", "005profil.jpg");
		Instructor i2 = new Instructor(115, "Ufuk", "�nsal", "006profil.jpg");
		
		Category ctg1 = new Category(1, "Programlama", "javareact");
		Category ctg2 = new Category(2, "Veri analizi", "angularcli");
		
		Instructor[] instructors = {i1, i2};
		Category[] categories = {ctg1, ctg2};
		
		//instructors dizisinin de�erleri tek tek Instructor tipindeki inst de�i�kenine atan�yor
		for(Instructor inst : instructors) {
			System.out.println(inst.firstName + " " + inst.lastName);
		}
		
		System.out.println("***********************************");
		
		ctgManager.add(ctg1);
		
		//categories dizisinin de�erleri tek tek Category tipindeki ctg de�i�kenine atan�yor
		for(Category ctg : categories) {
			System.out.println(ctg.name);
		}
		
		ctgManager.delete(ctg2);
		
	}

}
