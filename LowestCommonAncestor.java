
public class LowestCommonAncestor {
	
	public Node head;
	
	//Node class to represent Nodes of the binary tree with left, right and parent nodes as well as a key represented by a character
	public class Node{  
		private char c;
		public Node left, right, parent;
		private int n;
	}
	
	//Creates a new binary tree with a head
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
	
	/*An add node function thats adds a node to the tree based on its 
	key by recursively calling a private function */
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
	
	//A function to return a node given a key
	public Node findNode(char c){
		if(c == head.c){
			return head;
		}
		else {
			return findNode(c, head);
		}
	}
	
	private Node findNode(char c, Node head){
		Node ret = null;
		if(head.left != null){
			if (head.left.c == c){
				return head.left;
			}
			else{
				ret = findNode(c, head.left);
				if(ret != null){
					return ret;
				}
			}
		}
		if(head.right != null){
			if(head.right.c == c){
				return head.right;
			}
			else{
				ret = findNode(c, head.right);
				if(ret != null){
					return ret;
				}
			}
		}
		return null;
	}
	
	public int depth(char c){
		int depth = 0;
		Node node = findNode(c);
		while(node.parent != null){
			depth++;
			node = node.parent;
		}
		return depth;
	}
	
	//An implementation of the Lowest Common Ancestor Algorithm 
	public Node lowestCommonAncestor(Node root, Node p, Node q) {
	    if(root==null)
	        return null;
	 
	    if(root==p || root==q)
	        return root;
	 
	    Node l = lowestCommonAncestor(root.left, p, q);
	    Node r = lowestCommonAncestor(root.right, p, q);
	 
	    if(l!=null&&r!=null){
	        return root;
	    }else if(l==null&&r==null){
	        return null;
	    }else{
	        return l==null?r:l;
	    }
	}
	

	public String helloWorld(){
		return "HelloWorld";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
