import static org.junit.Assert.*;

import org.junit.Test;


public class MyHashMapTest {

	@Test
	public void test() {
		MyHashMap t = new MyHashMap(10);
		t.set("berry", "black");
		assertEquals("expected to be", "black", t.get("berry"));
	}

}
