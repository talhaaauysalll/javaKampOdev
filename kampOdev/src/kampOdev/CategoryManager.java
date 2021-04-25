package kampOdev;

public class CategoryManager {
	public void add(Category category) {
		System.out.println(category.categoryName+" Kategorisi Eklendi");
	}
	public void delete(Category category) {
		System.out.println(category.categoryName+" Kategorisi Silindi");
	}
	public void getAll(Category[] categories) {
		System.out.println("Eðitim Kategorilerimiz");
		System.out.println("--------------");
		for(Category category:categories) {
			System.out.println(category.categoryName); 
		}
	}
	
}
