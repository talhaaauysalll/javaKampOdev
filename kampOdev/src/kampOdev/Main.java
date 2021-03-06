package kampOdev;

import kampOdev2.Instructor;
import kampOdev2.InstructorManager;
import kampOdev2.Student;
import kampOdev2.StudentManager;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setName("Engin");
		instructor.setSurname("Demiro?");
		instructor.setInstructorCategoryName("Yaz?l?m");
		
		Instructor instructor1=new Instructor();
		instructor1.setId(2);
		instructor1.setName("Talha");
		instructor1.setSurname("Uysal");
		instructor1.setInstructorCategoryName("Siber G?venlik");
		
		Student student=new Student();
		student.setId(1);
		student.setName("Bu?ra");
		student.setSurname("Uysal");
		student.setStudentClass("Yaz?l?m S?n?f?");
		
		Student student1=new Student();
		student1.setId(2);
		student1.setName("Arda");
		student1.setSurname("Uysal");
		student1.setStudentClass("Siber G?venlik S?n?f?");
		
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
