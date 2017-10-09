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
		assertEquals("Create a head", 'a', lca.returnKey());
	}

}
