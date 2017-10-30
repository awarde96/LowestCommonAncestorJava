import java.util.ArrayList;
import java.util.List;


public class LCADAG {
	
	public Node head;
	
	public class Node{
		int value;
		char key;
		List<Node> parents = new ArrayList<Node>();
		List<Node> children = new ArrayList<Node>();
	}

	public void createHead(int value, char key){
		Node head = new Node();
		head.value = value;
		head.key = key;
		head.parents = new ArrayList<Node>();
		head.children = new ArrayList<Node>();
		this.head = head;
	}
	
	public int returnvalue(Node node){
		return node.value;
	}
	
	public char returnKey(Node newNode){
		return newNode.key;
	}
	
	public void addNode(char key, int value,Node parent){
		Node newNode = new Node();
		newNode.key = key;
		newNode.children = new ArrayList<Node>();
		newNode.value = value;
		newNode.parents.add(parent);
		parent.children.add(newNode);
	}
	
}
