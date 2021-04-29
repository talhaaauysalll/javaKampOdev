package kampOdev2;

import kampOdev.UserManager;

public class InstructorManager extends UserManager{
	
	public void getAllInstructorCategoryName(Instructor[] instructors) {
		System.out.println("Eðitmenlerimizin Branþlarý");
		System.out.println("--------------");
		for(Instructor instructor:instructors) {
			System.out.println(instructor.getName()+" "+instructor.getSurname()+" "+instructor.getInstructorCategoryName());
		}
	}
}
