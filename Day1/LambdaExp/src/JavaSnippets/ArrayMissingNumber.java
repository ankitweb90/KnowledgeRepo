package AallSolutions;

import java.util.Arrays;

public class ArrayMissingNumber {

	public static void main(String[] args) {
		
		//multiple missing numbers
		int arr[] = {1,2,4,5,6,8,9,1,4,5};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int newarr[] = new int[arr.length];
		
		for(int entry: arr){
			
		//	if(entry < newarr.length)
			newarr[entry] = 1; 
		}
		
		for(int i=0;i<newarr.length-1;i++){
			
			if(newarr[i] == 0)
			System.out.println(i);
		}
		int arr1[] = {1,2,4,5,6,7};
		int x = getMissingNo(arr1, arr1.length);
	}
	
	static int getMissingNo(int a[], int n) 
    { 
        int i, total; 
        total = n*(n+1)/2; 
        for (i = 0; i < n-1; i++) 
            total -= a[i]; 
        return total; 
    } 

}
