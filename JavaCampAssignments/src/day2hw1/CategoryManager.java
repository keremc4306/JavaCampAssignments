package day2hw1;

public class CategoryManager {
	public void add(Category category) {
		System.out.println("Kategori eklendi: " + category.name);
	}
	
	public void delete(Category category) {
		System.out.println("Kategori silindi: " + category.name);
	}
}