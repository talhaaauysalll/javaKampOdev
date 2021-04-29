package kampOdev1;

public class StudentManager extends UserManager {
	public void getAllStudentClasses(Student[] students) {
		System.out.println("Öğrencilerimizin sınıfları");
		for(Student student:students) {
			System.out.println(student.getName()+" "+student.getSurname()+" "+student.getStudentClass());
		}
		
	}
}
