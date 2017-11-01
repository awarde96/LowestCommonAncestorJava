import static org.junit.Assert.*;

import org.junit.Test;

public class LCADAGTest {

	@Test
	public void testHead() {
		LCADAG tree = new LCADAG();
		tree.createHead(1, 'a');
		assertEquals("Return head", 'a', tree.returnKey(tree.head));
	}
	
	@Test
	public void testAdd(){
		LCADAG tree = new LCADAG();
		tree.createHead(1,'a');
		tree.addNode('b',2,tree.head);
		assertEquals("Get first node added",'b',tree.returnKey(tree.head.children.get(0)));		
		tree.addNode('c', 3, tree.head.children.get(0));
		assertEquals("Get second node added",'c',tree.returnKey(tree.head.children.get(0).children.get(0)));
		tree.addNode('d',4,tree.head);
		assertEquals("Get first node added",'d',tree.returnKey(tree.head.children.get(1)));	
	}
	
	@Test
	public void testFind(){
		LCADAG tree = new LCADAG();
		tree.createHead(1,'a');
		assertEquals("Find head",'a',tree.returnKey(tree.findNode('a')));
		tree.addNode('b',2,tree.head);
		assertEquals("Find new Node",'b',tree.returnKey(tree.findNode('b')));
	}
	
	@Test
	public void testLCA(){
		LCADAG tree = new LCADAG();
		tree.createHead(1,'a');
	}

}
