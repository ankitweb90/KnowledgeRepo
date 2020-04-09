package ConsumerFunction;

import java.util.Arrays;
import java.util.List;

public class StudentDB {
	
	
	
	public static List<Student> getAllStudent(){
		
		Student student1 = new Student("ankit", 5, 8.9, "m");
		Student student2 = new Student("sophie", 5, 3.5, "f");
		Student student3 = new Student("sam", 7, 5.9, "m");
		Student student4 = new Student("david", 7, 4.6, "m");
		
		List<Student> studentList = Arrays.asList(student1, student2, student3, student4);
		
		return studentList;
	}

}
