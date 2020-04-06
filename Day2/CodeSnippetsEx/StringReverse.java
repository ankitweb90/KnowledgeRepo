package AallSolutions;

import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		
		String name = "ankit";
		String rev = new StringBuilder(name).reverse().toString();
		System.out.println(rev);
		
		StringBuilder sb = new StringBuilder();
		for(int i = name.length()-1;i>=0;i--){
			sb.append(name.charAt(i));
		}
		System.out.println(sb.toString());
		
		StringBuilder ss = new StringBuilder();
		
		String ff = reverse(name, ss);
		System.out.println(ff);
	}
	
	private static String reverse(String name, StringBuilder ss){
		
		if(!name.isEmpty()){
			Character ab = name.charAt(name.length()-1);
			ss.append(ab.toString());
		}else{
			return ss.toString();
		}
		
		return reverse(name.substring(0,name.length()-1), ss);
		
	}

}
