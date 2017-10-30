import static org.junit.Assert.*;

import org.junit.Test;

public class LCADAGTest {

	@Test
	public void testHead() {
		LCADAG tree = new LCADAG();
		tree.createHead(1, 'a');
		assertEquals("Return head", 'a', tree.returnKey(tree.head));
	}

}
