package AallSolutions;

import java.util.Arrays;

public class StringSortAlphabetical {

	public static void main(String[] args) {
		
		String name = "ankit";
		
		char arr[] = name.toCharArray();
		
		for(int i=0;i<arr.length;i++){
			for(int j = i+1;j<arr.length;j++){
				if(arr[j] < arr[i]){
				//	if(Character.toLowerCase(arr[j]) < Character.toLowerCase(arr[i])){
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
