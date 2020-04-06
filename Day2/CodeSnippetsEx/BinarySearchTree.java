package AallSolutions;

class Node{
	int value;
	Node left,right;
	public Node(int value) {
		super();
		this.value = value;
		left=right=null;
	}
}

public class BinarySearchTree {

	Node root;
	
	public static void main(String[] args) {
	
	BinarySearchTree tree = new BinarySearchTree();
	
	tree.add(10);
	tree.add(60);
	tree.add(40);
	tree.add(50);
	tree.add(30);

	
	}
	
	private void add(int value){
		root = addRecursively(root, value);
	}
	
	private Node addRecursively(Node current, int value){
		
		if(current == null){
			return new Node(value);
		}
		if(value<current.value){
			current.left = addRecursively(current.left, value);
		}else{
			current.right = addRecursively(current.right, value);
		}
		
		return current;
	}

}
