package AallSolutions;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		
		int n=0,m=10;
		
		for(int i=n;i<m;i++){
			
			if(i%2==0){
				System.out.println(i);
			}
		}
		boolean flag = true;
		for(int i=n;i<m;i++){
			
			if(flag){
				System.out.println(i);
				flag=false;
			}else{
				flag = true;
			}
		}
	}

}
