
public class LowestCommonAncestor {
	
	private Node head;
	
	private class Node{
		private char c;
		private Node left, right, parent;
		private int n;
	}
	
	public void createHead(char c){
		Node head = new Node();
		head.c = c;
		head.left = null;
		head.right = null;
		head.n = 0;
		this.head = head;
	}
	
	public char returnKey(){
		return head.c;
	}
	
	

	public String helloWorld(){
		return "HelloWorld";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
