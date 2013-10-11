import java.util.ArrayList;
import java.util.List;


public class MyHashMap {
	List<KeyValuePairs>[] myHashMap;
	
	@SuppressWarnings("unchecked")
	public MyHashMap(int numberOfBuckets){
		myHashMap = new ArrayList[numberOfBuckets];
		for(int i = 0; i < numberOfBuckets; i++){
			myHashMap[i] = new ArrayList<KeyValuePairs>();
		}
		/*
		myHashMap = new ArrayList<List<KeyValuePairs>>();
		for (int i = 0; i <= numberOfBuckets; i++){
			myHashMap.add(new ArrayList<KeyValuePairs> (i));
		}
		*/
		
	} 
	
	
	public void set(String key, String value){
		int bin = (key.length()*key.charAt(0)) % (myHashMap.length - 1);
		KeyValuePairs x = new KeyValuePairs(key,value);
		myHashMap[bin].add(x);
		x.getValue();
	}
	public String get(String key){
		int bin = (key.length()*key.charAt(0)) % 9;
		List<KeyValuePairs> l = myHashMap[bin];
		int i = 0;
		while(i < l.size()){
		String myX =l.get(i).getKey();
			if (myX.equals(key)){
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
