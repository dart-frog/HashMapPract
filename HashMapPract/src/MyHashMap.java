import java.util.ArrayList;
import java.util.List;


public class MyHashMap {
	List<List<KeyValuePairs>> myHashMap;
	
	public MyHashMap(int numberOfBuckets){
		myHashMap = new ArrayList<List<KeyValuePairs>>();
		for (int i = 0; i <= numberOfBuckets; i++){
			myHashMap.add(new ArrayList<KeyValuePairs>(i));
		}
		
	} 
	
	
	public void set(String key, String value){
		int bin = (key.length()*key.charAt(0)) % (myHashMap.size() - 1);
		KeyValuePairs x = new KeyValuePairs(key,value);
		myHashMap.get(bin).add(x);
	}
	public String get(String key){
		int bin = (key.length()*key.charAt(0)) % 10;
		List<KeyValuePairs> l = myHashMap.get(bin);
		int i = 0;
		while(i < l.size()){
			if (l.get(i).getKey().equals(key)){
				return l.get(i).getValue();
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
