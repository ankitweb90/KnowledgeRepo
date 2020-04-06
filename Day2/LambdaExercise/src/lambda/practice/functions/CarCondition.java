package lambda.practice.functions;

@FunctionalInterface
public interface CarCondition {
	
	public boolean test(Car c);

}
