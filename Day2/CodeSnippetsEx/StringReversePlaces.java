package AallSolutions;

public class StringReversePlaces {

	public static void main(String[] args) {
		
		String name = "Lets do it";
		
		String arr[] = name.split(" ");
		
		for(int i=0;i<arr.length;i++){
			StringBuilder sb = new StringBuilder();	
			
			for(int j=arr[i].length()-1;j>=0;j--){
				sb.append(arr[i].charAt(j));
				
			}
			arr[i] = sb.toString();
		}
		
		for(String entry:arr){
			System.out.print(entry + " ");
		}
	}

}
