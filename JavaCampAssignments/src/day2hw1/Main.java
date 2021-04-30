package day2hw1;

public class Main {

	public static void main(String[] args) {
		CategoryManager ctgManager = new CategoryManager(); //CategoryManager sýnýfýndan ctgManager adýnda nesne oluþturdum.
		
		System.out.println("Instructors:");
		
		Instructor i1 = new Instructor(100, "Utku", "Çelik", "005profil.jpg");
		Instructor i2 = new Instructor(115, "Ufuk", "Ünsal", "006profil.jpg");
		
		Category ctg1 = new Category(1, "Programlama", "javareact");
		Category ctg2 = new Category(2, "Veri analizi", "angularcli");
		
		Instructor[] instructors = {i1, i2};
		Category[] categories = {ctg1, ctg2};
		
		//instructors dizisinin deðerleri tek tek Instructor tipindeki inst deðiþkenine atanýyor
		for(Instructor inst : instructors) {
			System.out.println(inst.firstName + " " + inst.lastName);
		}
		
		System.out.println("***********************************");
		
		ctgManager.add(ctg1);
		
		//categories dizisinin deðerleri tek tek Category tipindeki ctg deðiþkenine atanýyor
		for(Category ctg : categories) {
			System.out.println(ctg.name);
		}
		
		ctgManager.delete(ctg2);
		
	}

}
