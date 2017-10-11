import static org.junit.Assert.*;

import org.junit.Test;

public class LowestCommonAncestorTest {

	@Test
	public void test() {
		LowestCommonAncestor test = new LowestCommonAncestor();
		assertEquals("First Test", "HelloWorld", test.helloWorld());;
	}
	
	@Test
	public void testCreateHead(){
		LowestCommonAncestor lca = new LowestCommonAncestor();
		lca.createHead('a');
		assertEquals("Create a head", 'a', lca.returnKey(lca.head));
	}
	
	@Test
	public void testAddNode(){
		LowestCommonAncestor lca = new LowestCommonAncestor();
		lca.createHead('d');
		lca.addNode('a');
		assertEquals("Add node A", 'a', lca.returnKey(lca.head.left));
		lca.addNode('h');
		assertEquals("Add node A", 'h', lca.returnKey(lca.head.right));
		lca.addNode('b');
		assertEquals("Add node A", 'b', lca.returnKey(lca.head.left.right));
		lca.addNode('f');
		assertEquals("Add node A", 'f', lca.returnKey(lca.head.right.left));
		lca.addNode('k');
		assertEquals("Add node A", 'k', lca.returnKey(lca.head.right.right));
	}

}
