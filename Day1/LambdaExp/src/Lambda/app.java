package Lambda;

public class app {

	public static void main(String[] args) {
	

		human tom = new human();
		walker(tom);
		
		robot walle = new robot();
		walker(walle);
		
		walker(() -> System.out.println("custom object walking..."));     // for one command
		
		walker(() -> {
			System.out.println("custom object walking...");              // for multi commands
			System.out.println("custom object walking again...");
		});
		
		//type(Alambda in this case) of lambda expressions is a functional interface
		walkable blockOfCode = () -> {
			System.out.println("custom object walking...");              // for functional programming, create functional 
			System.out.println("custom object walking again...");        // interface(only one abstract method) type 
		};
		
		
		     factor factor = (int number) -> {
			  int result = 1;
			  
			  for(int i=number; i>0; i--) {
				  result *=i;
			  }
				
				
				return result;
			
		};
		
		System.out.println("factor----" + factor.factor(5));
		
		
		
		sum sum = (a,b) -> {
			
			return a+b;
		};

		walker(blockOfCode);
	}
	
	public static int factorial(int number) {
		
	  int result = 1;
	  
	  for(int i=number; i>0; i--) {
		  result *=i;
	  }
		
		
		return result;
	}
	
	public static void walker(walkable object) {
	
		object.walk();
	}

}

interface factor {
	
	public int factor(int number);
}
