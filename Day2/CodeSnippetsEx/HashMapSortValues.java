package AallSolutions;

import java.util.*;
public class HashMapSortValues {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 40);
		map.put("D", 50);
		map.put("T", 20);
		map.put("S", 70);
		map.put("B", 10);
		map.put("R", 30);
		
		List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
		System.out.println("list - " + list);
		
	/*	Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
				
				return o1.getValue().compareTo(o2.getValue());
			}	
		});
		
	*/	
		
		
		
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>(){
			
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		
		Map<String, Integer> finalMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, Integer> entry : list){
			finalMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println(map.toString());
		System.out.println(finalMap.toString());
		
		
		
		
	}

}
