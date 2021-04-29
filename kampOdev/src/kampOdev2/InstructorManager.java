package kampOdev;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.instructorName+" "+instructor.instructorSurname+" ekibe katýldý");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.instructorName+" "+instructor.instructorSurname+" ekibden ayrýldý");
	}
	public void getAll(Instructor[] instructors) {
		System.out.println("Eðitmenlerimiz");
		System.out.println("--------------");
		for(Instructor instructor:instructors) {
			System.out.println(instructor.instructorName+" "+instructor.instructorSurname);
		}
	}
}
