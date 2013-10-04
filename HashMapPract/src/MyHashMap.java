import java.util.ArrayList;
import java.util.List;


public class MyHashMap {
	List<KeyValuePairs>[] myHashMap;
	public MyHashMap(int numberOfBuckets){

		
		myHashMap = new ArrayList[numberOfBuckets];
	}
	public void set(String key, String value){
		int bin = (key.length()*key.charAt(0)) % myHashMap.length;
		KeyValuePairs x = new KeyValuePairs(key,value);
		myHashMap[bin].add(x);
	}
	public String get(String key){
		int bin = (key.length()*key.charAt(0)) % 10;
		List<KeyValuePairs> l = myHashMap[bin];
		int i = 0;
		while(i < l.size()){
			if (l.get(i).getKey().equals(key)){
				return key;
			}
			i++;
		}
		return "no";
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
