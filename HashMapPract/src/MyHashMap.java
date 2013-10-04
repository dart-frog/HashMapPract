import java.util.ArrayList;
import java.util.List;


public class MyHashMap {
	List<KeyValuePairs>[] myHashMap;
	public MyHashMap(int numberOfBuckets){

		
		myHashMap = new ArrayList[numberOfBuckets];
	}
	public void set(String key, String value){
		
		int bin = (key.length()*key.charAt(0)) % 10;
		//myHashMap[bin].add(keyValuePairs(key,value));
	}
	public String get(String key){
		
		return null;
	}
	public List<String> getKeys(){
		return null;
	}
	public boolean exists(String Key){
		return false;
	}
	public int size(){
		return 0;
	}
	
	
	
	
}
