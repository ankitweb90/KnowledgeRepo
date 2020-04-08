package PriorityBlockingQueue;

public class Student {
    String name;
    int rank;
	
    public Student(String name, int rank) {
        this.name = name;
	this.rank = rank;
    }
	
    public int getRank() {
	return this.rank;
    }
	
    public String toString() {
	return String.format("name : %s, rank : %d", name, rank);
    }
}
