package AallSolutions;

public class StringAnagram {

	public static void main(String[] args) {
		
		String a = "arasdsdmy";
		String b = "sdsdmarya";
		
	boolean res = result(a,b);
	System.out.println(res);

	}

	private static boolean result(String a, String b){
		
		if(a.length() != b.length()){
			return false;
		}
		
		char arr[] = a.toCharArray();
		
		for(char x : arr){
			int value = b.indexOf(x);
			
			if(value != -1){
				b =b.substring(0, value) + b.substring(value+1, b.length());
			}else{
				return false;
			}
			
		}
		return b.isEmpty();
	}
}
