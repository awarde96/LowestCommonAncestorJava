import java.util.ArrayList;
import java.util.List;

public class LCADAG {
	
	public Node head;
	
	private class Node{
		int value;
		char key;
		Node parent;
		List children = new ArrayList();
	}

	public void createHead(int value, char key){
		Node head = new Node();
		head.value = value;
		head.key = key;
		head.parent = null;
		head.children = null;
		this.head = head;
	}
	
	public int returnvalue(Node node){
		return node.value;
	}
	
	public char returnKey(Node node){
		return node.key;
	}
}
