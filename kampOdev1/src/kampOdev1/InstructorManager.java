package kampOdev1;

public class InstructorManager extends UserManager {
	public void getAllInstructorCategoryName(Instructor[] instructors) {
		System.out.println("Eğitmenlerimizin branşları");
		for(Instructor instructor:instructors) {
			System.out.println(instructor.getName()+" "+instructor.getSurname()+" "+instructor.getInstructorCategoryName());
		}
	}
	
}
