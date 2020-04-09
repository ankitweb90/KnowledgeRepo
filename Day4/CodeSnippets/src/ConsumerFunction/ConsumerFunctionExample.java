package ConsumerFunction;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionExample {
	
	
	
	public static void printList() {
		
		Consumer<Student> c2 = (Student) -> System.out.println(Student);
		List<Student> studentList = StudentDB.getAllStudent();
		
		//consumer implementation way
		studentList.forEach(c2);
		
		//normal way 
		for(Student student: studentList) {
			
			System.out.println(student.toString());
			
		}
		
	}

	public static void main(String[] args) {
	

		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		
		c1.accept("ankit mehra");
		
		printList();

	}

}
