package ExamplesForEach;

import java.util.*;
import java.util.stream.Collectors;

import javax.sound.sampled.LineUnavailableException;

public class MapSort {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1", "ankit");
		map.put("2", "mehra");
		map.put("5", "sam");
		map.put("3", "sophie");
		map.put("4", "jacob");
		map.put("8", "andy");
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.<String, String>comparingByKey())
		.forEach(System.out::println);
		
		Map<String, String> sortedMap = map.entrySet()
										.stream()
										.sorted(Map.Entry.<String, String>comparingByValue())
										.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue
												,(e1, e2) -> e1,LinkedHashMap::new));
		
		System.out.println(sortedMap);

	}

}
