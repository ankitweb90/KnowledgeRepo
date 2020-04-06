package AallSolutions;

import java.util.Arrays;

public class ArrayShiftRight2Places {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<2;i++){
			int number = arr[0];
			for(int j = 0;j<arr.length-1;j++){
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = number;
		}
		
		System.out.println("ankit");
		System.out.println(Arrays.toString(arr));
	}

}
