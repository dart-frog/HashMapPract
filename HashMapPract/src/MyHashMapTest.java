import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class MyHashMapTest {

	@Test
	public void getTest() {
		MyHashMap t = new MyHashMap(10);
		t.set("berry", "black");
		t.set("car", "bugatti");
		t.set("can", "tuna");
		assertEquals("verify that it can return a key", "bugatti",t.get("car"));
		assertEquals("verify that it can choose between keys", "black", t.get("berry"));
		assertEquals("verify that it cam choose between two keys from the same bucket", "tuna", t.get("can"));
	}
	@Test
	public void getKeysTest() {
		MyHashMap t = new MyHashMap(10);
		t.set("berry", "black");
		t.set("car", "bugatti");
		t.set("can", "tuna");
		ArrayList<String> myT = new ArrayList<String>();
		myT.add("car");
		myT.add("can");
		myT.add("berry");
		assertEquals("verify that it can return a list of strings", myT,t.getKeys());
	}
	@Test
	public void getExists(){
		MyHashMap t = new MyHashMap(10);
		t.set("berry", "black");
		t.set("car", "bugatti");
		t.set("can", "tuna");
		assertEquals("verify that you can check if something exists", true, t.exists("can"));
	}

}
