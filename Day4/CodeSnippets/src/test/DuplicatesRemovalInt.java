package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesRemovalInt {

	public static void main(String[] args) {
		
		//Normal Approach
		
		List<Integer> listInt = Arrays.asList(1,2,4,6,3,4,7,9,2,6);
		
		Set<Integer> setList = new HashSet<>();
		for(int i=0; i<listInt.size(); i++) {		
			setList.add(listInt.get(i));			
		}

		System.out.println(setList);
		
		//declarative Approach
		
		List<Integer> listInt1 = listInt.stream()
										.distinct()
										.collect(Collectors.toList());
		
		System.out.println(listInt1);
		
		
	}

}
