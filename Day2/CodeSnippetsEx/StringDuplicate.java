package AallSolutions;

import java.util.*;

public class StringDuplicate {

	public static void main(String[] args) {

		String name = "nkitank";
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<name.length();i++){
			
			if(map.containsKey(name.charAt(i))){
				map.put(name.charAt(i), map.get(name.charAt(i))+1);
				
			}else{
				map.put(name.charAt(i),1);
			}
			
		}
		System.out.println(map.toString());
		
		
		//remove duplicates in string
		Set<Character> set = new HashSet<>();
		
		for(int i=0;i<name.length();i++){
			set.add(name.charAt(i));
		}
		System.out.println(set.toString());
		
	}

}
