package AallSolutions;

import java.sql.Array;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,6,5,7,8,9};
		Arrays.sort(arr);
		int number = 9;
		boolean res = binarySearch(arr, 0,arr.length-1, number);
		System.out.println(res);
	}
	
	public static boolean binarySearch(int arr[], int i, int j, int k){
		
	if(i<=j){	
		int m = i+(j-i)/2;
		
		if(arr[m]==k){
			return true;
		}
		
		if(arr[m]>k){
			return binarySearch(arr,i,m-1,k);
		}else{
			return binarySearch(arr,m+1,j,k);
		}
		
	}

	return false;
	}
}
