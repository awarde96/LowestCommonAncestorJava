
public class LowestCommonAncestor {
	
	public Node head;
	
	public class Node{
		private char c;
		public Node left, right, parent;
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
	
	public char returnKey(Node node){
		return node.c;
	}
	
	public void addNode(char c){
		Node newNode = new Node();
		newNode.c = c;
		newNode.left = null;
		newNode.right = null;	
		addNode(newNode, head);
	}
	
	private void addNode(Node newNode, Node head){
		if(newNode.c < head.c){
			if(head.left == null){
				head.left = newNode;
				newNode.parent = head;
			}
			else{
				addNode(newNode, head.left);
			}
		}
		else{
			if(head.right == null){
				head.right = newNode;
				newNode.parent = head;
			}
			else{
				addNode(newNode, head.right);
			}
		}
	}
	
	

	public String helloWorld(){
		return "HelloWorld";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
