package AallSolutions;

public class Fibonnaci {
	
	static int index = 0;
	static int stop = 10;
	
	public static void main(String[] args) {
		
		int n1=0,n2=1;
		
		fibonnaci(n1,n2);
	}
	
	private static void fibonnaci(int n1, int n2){
		
		if (n1==0){
			System.out.println(n1+"\n"+n2);
		}else{
			System.out.println(n2);
		}
		
		if(index == stop){
		return;
		}
		index++;
		
		fibonnaci(n2, n1+n2);
		
		
		
	}

}
