import static org.junit.Assert.*;

import org.junit.Test;


public class MyHashMapTest {

	@Test
	public void test() {
		MyHashMap t = new MyHashMap(10);
		t.set("berry", "black");
		t.set("car", "bugatti");
		assertEquals("verify that it can return a key", "black", t.get("berry"));
		assertEquals("verify again that it can return a key", "bugatti",t.get("car"));
		
	}

}
