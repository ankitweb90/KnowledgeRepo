package AallSolutions;

import java.util.*;

public class ArrayDuplicates {

	public static void main(String[] args) {

		int arr[] = {4,6,5,7,8,7,6,3,4,3,4};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int entry:arr){
			
			if(map.containsKey(entry)){
				int value = map.get(entry);
				map.put(entry, value+1);
			}else{
				map.put(entry, 1);
			}
		}
		System.out.println(map.toString());
		
		//remove duplicates from an array
		
		Set<Integer> ss = new HashSet<Integer>();
		
		for(int i = 0;i<arr.length;i++){
			ss.add(arr[i]);
		}
		
		int newarr[] = new int[ss.size()];
		int i=0;
		for(int check : ss){
			newarr[i++] = check; 
					
		}
		System.out.println(Arrays.toString(newarr));
	}

}
