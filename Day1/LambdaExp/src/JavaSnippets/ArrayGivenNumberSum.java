package AallSolutions;

import java.util.*;

public class ArrayGivenNumberSum {

	public static void main(String[] args) {
		
		//int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr = {3,2,4};
		
		
		int number = 6;
		
		for(int i=0;i<arr.length;i++){
			for(int j = i+1; j<arr.length;j++){
				if(arr[i]+arr[j] == number){
					System.out.println(arr[i] + " with " + arr[j]);
				}
			}
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			
			if(map.containsKey(arr[i])){
				System.out.println(arr[i] + " alongwith " + map.get(arr[i]));
			}else{
				map.put(number-arr[i], arr[i]);
			}
			
		}
		
		System.out.println(map);

	}

}
