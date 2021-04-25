package kampOdev;

public class Main {

	public static void main(String[] args) {
		Category category=new Category();
		category.id=1;
		category.categoryName="Yazýlým";
		
		Category category1=new Category();
		category1.id=2;
		category1.categoryName="Sistem";
		
		Category category2=new Category();
		category2.id=3;
		category2.categoryName="Güvenlik";
		
		Instructor instructor=new Instructor(1,"Talha","UYSAL");
		Instructor instructor2=new Instructor(2, "Buðra", "UYSAL");
		Instructor instructor3=new Instructor(3, "Arda", "UYSAL");
		
		CategoryManager categoryManager=new CategoryManager();
		categoryManager.add(category);
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		Category[] categories= {category,category1,category2};
		categoryManager.getAll(categories);
		System.out.println("-------------------------------------");
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.add(instructor2);
		instructorManager.add(instructor3);
		Instructor[] instructors= {instructor,instructor2,instructor3};
		instructorManager.getAll(instructors);
		
	}

}
