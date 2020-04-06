package AallSolutions;

import java.util.Arrays;

public class ArraySortAlphabetical {

	public static void main(String[] args) {
		
		//if array is of string
		String arr[] = {"f","r","a","t","h","z","d","a"};
		
		for(int i = 0; i<=arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[j].compareTo(arr[i])<0){
					String temp =  arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	
		//if array is of character
		String name = "ankit";
		String[] ss = name.split("");
		System.out.println(Arrays.toString(ss));
		char[] chara = name.toCharArray();
		
		for(int i=0; i<chara.length;i++){
			for(int j = i+1; j<chara.length; j++){
				
				if(chara[j] < chara[i]){
					char temp = chara[i];
					chara[i] = chara[j];
					chara[j] = temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(chara));
		
		
		//if array is of int
		int intarr[] = {5,7,1,4,3,9,8,2,6};
		
		for(int i = 0;i<intarr.length;i++){
			for(int j=i+1;j<intarr.length;j++){
				if(intarr[j] < intarr[i]){
					int temp = intarr[i];
					intarr[i] = intarr[j];
					intarr[j] = temp;
				}
			}
		}System.out.println(Arrays.toString(intarr));
	}

}
