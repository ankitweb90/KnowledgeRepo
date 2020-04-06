package AallSolutions;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int revers[]= new int[arr.length];
		int h=0;
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(Integer.toString(arr[i]));
			revers[h++]= arr[i];
		}
		
		System.out.println(Arrays.toString(revers));
		
		int count=0;
		String strarr[] = {"ankit","mehra","test"};
		String finalarr[] = new String[strarr.length];
		for(int i=strarr.length-1;i>=0;i--){
			System.out.println(strarr[i]);
			finalarr[count++] = strarr[i];
		}
		System.out.println(Arrays.toString(finalarr));
		
		//array reverse in places
		
		String arrr[] = {"ankit","mehra","test"};
		String[] finalnew = new String[arrr.length];
		for(int i = 0;i<arrr.length;i++){
			finalnew[i] = new StringBuilder(arrr[i]).reverse().toString();
			
		}

	}

}
