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
		
	}

}
