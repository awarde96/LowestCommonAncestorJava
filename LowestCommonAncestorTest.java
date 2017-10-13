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
		assertEquals("Add node h", 'h', lca.returnKey(lca.head.right));
		lca.addNode('b');
		assertEquals("Add node b", 'b', lca.returnKey(lca.head.left.right));
		lca.addNode('f');
		assertEquals("Add node f", 'f', lca.returnKey(lca.head.right.left));
		lca.addNode('k');
		assertEquals("Add node k", 'k', lca.returnKey(lca.head.right.right));
	}
	
	@Test
	public void testFindNode(){
		LowestCommonAncestor lca = new LowestCommonAncestor();
		lca.createHead('d');
		assertEquals("Find head Node", 'd', lca.returnKey(lca.findNode('d')));
		lca.addNode('a');
		assertEquals("Find left Node", 'a', lca.returnKey(lca.findNode('a')));
		lca.addNode('h');
		assertEquals("Find right Node", 'h', lca.returnKey(lca.findNode('h')));
		lca.addNode('b');
		assertEquals("Find b Node", 'b', lca.returnKey(lca.findNode('b')));
		lca.addNode('f');
		assertEquals("Find f Node", 'f', lca.returnKey(lca.findNode('f')));
		lca.addNode('l');
		lca.addNode('c');
		lca.addNode('v');
		assertEquals("Find v Node", 'v', lca.returnKey(lca.findNode('v')));
	}
	
	@Test
	public void testDepth(){
		LowestCommonAncestor lca = new LowestCommonAncestor();
		lca.createHead('d');
		assertEquals("Depth of head", 0, lca.depth('d'));
		lca.addNode('a');
		assertEquals("Depth of a", 1, lca.depth('a'));
		lca.addNode('b');
		assertEquals("Depth of b", 2, lca.depth('b'));
		lca.addNode('c');
		assertEquals("Depth of c", 3, lca.depth('c'));
	}

}
