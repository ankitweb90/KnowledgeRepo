package AallSolutions;

public class ArrayBiggestSubstring {

	public static void main(String[] args) {
		
		String s = "my name is ankit mehra";
		String[] arr = s.split(" ");
		String max="";
		
		for(int i=0;i<arr.length;i++){
			if(arr[i].length() > max.length()){
				max = arr[i];
			}
	}
		
		System.out.println(max);
}

}
