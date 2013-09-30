import static org.junit.Assert.*;

import org.junit.Test;


public class HashSpaceTest {

	@Test
	public void test() {
		HashSpace t = new HashSpace(10);
		t.add(345);
		assertEquals("hash val expected to be 1", "agdolaafagj", t.getVal("agdolaafagj"));
		fail("Not yet implemented");
	}

}
