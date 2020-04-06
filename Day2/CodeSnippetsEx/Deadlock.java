package AallSolutions;

public class Deadlock{
	
	Thread t1 = new Thread(){
		public void run(){	
			synchronized(Integer.class){
				System.out.println("integer class t1");
				synchronized(String.class){
					
					System.out.println("String class t1");
				}
			}}};
	
	Thread t2 = new Thread(){
			public void run(){
			synchronized(Integer.class){
				System.out.println("integer class t2");
				synchronized(String.class){
					
					System.out.println("String class t2");
				}
			}}};
	
	public static void main(String[] args){
		Deadlock a = new Deadlock();
		a.t1.start();
		a.t2.start();
		
	}
	}
	
		


