package genericsPrac;

import java.util.*;

public class genericstest<T> {
	
	private List<T> list = new ArrayList<>();
	

	public static void main(String[] args) {
		
	//	List<T> list = new ArrayList<>();
		genericstest<String> obj = new genericstest<String>();
		
		obj.list.add("ankit");
		obj.list.add("mehra");
		
		
		genericstest<Integer> obj1 = new genericstest<>();
		
		obj1.list.add(10);
		obj1.list.add(20);
		
		genericDisplay("ankit");
		genericDisplay(100);
		

	}
	
	// A Generic method example 
    static <T> void genericDisplay (T element) 
    { 
        System.out.println(element.getClass().getName() + 
                           " = " + element); 
    } 

}
