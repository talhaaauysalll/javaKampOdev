package kampOdev1;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setName("Talha");
		instructor.setSurname("UYSAL");
		instructor.setInstructorCategoryName("Siber G?venlik");
		
		Instructor instructor1=new Instructor();
		instructor1.setId(2);
		instructor1.setName("Engin");
		instructor1.setSurname("DEM?RO?");
		instructor1.setInstructorCategoryName("Yaz?l?m");
		
		Student student=new Student();
		student.setId(1);
		student.setName("Bu?ra");
		student.setSurname("UYSAL");
		student.setStudentClass("Yaz?l?m S?n?f?");
		
		Student student1=new Student();
		student1.setId(2);
		student1.setName("Arda");
		student1.setSurname("UYSAL");
		student1.setStudentClass("G?venlik S?n?f?");
		
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
		

	}

}
