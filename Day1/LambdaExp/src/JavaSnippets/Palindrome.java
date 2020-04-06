package AallSolutions;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "ABCDCBA";
		StringBuilder sb = new StringBuilder();
		for(int i = s.length()-1;i>=0;i--){
			sb.append(s.charAt(i));
		}
		
		if(s.equalsIgnoreCase(sb.toString())){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		int x = s.length();
		for(int j=0;j<s.length()/2;j++){
			
			if(s.charAt(j) != s.charAt(x)){
				System.out.println("false");
				break;
			}else{
				x--;
			}
		}
	}

}
