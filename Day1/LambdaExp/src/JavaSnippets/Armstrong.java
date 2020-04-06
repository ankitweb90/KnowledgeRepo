package AallSolutions;

public class Armstrong {

	public static void main(String[] args) {
		
		int n = 371;
		int r, b=0, temp = n;
		
		while(n>0){
			r=n%10;
			n=n/10;
			b = b+r*r*r;
		}
		if(temp == b)
			System.out.println(true);
		else{
			System.out.println(false);
		}

	}

}
