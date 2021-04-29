package kampOdev2;



public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setName("Engin");
		instructor.setSurname("Demiroğ");
		instructor.setInstructorCategoryName("Yazılım");
		
		Instructor instructor1=new Instructor();
		instructor1.setId(2);
		instructor1.setName("Talha");
		instructor1.setSurname("Uysal");
		instructor1.setInstructorCategoryName("Siber Güvenlik");
		
		Student student=new Student();
		student.setId(1);
		student.setName("Buğra");
		student.setSurname("Uysal");
		student.setStudentClass("Yazılım Sınıfı");
		
		Student student1=new Student();
		student1.setId(2);
		student1.setName("Arda");
		student1.setSurname("Uysal");
		student1.setStudentClass("Siber Güvenlik Sınıfı");
		
		Instructor[] instructors= {instructor,instructor1};
		Student[] students= {student,student1};
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.add(instructor1);
		instructorManager.getAll(instructors);
		instructorManager.getAllInstructorCategoryName(instructors);
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		studentManager.add(student1);
		studentManager.getAll(students);
		studentManager.getAllStudentClasses(students);
		//ddasdasads
		
		
	}

}
