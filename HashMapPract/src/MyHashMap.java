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
		
	} 
	/* *
	 * Adds a key value pair to the hashmap
	 * @param key sets the key of the KeyValuePair
	 * @param value sets the value of the KeyValuePair
	*/
	public void set(String key, String value){
		int bin = (key.length()*key.charAt(0)) % (myHashMap.length - 1);
		KeyValuePairs x = new KeyValuePairs(key,value);
		myHashMap[bin].add(x);
		x.getValue();
	}
	/**
	 * Returns the value of a given key
	 * @param key is the value you are looking for 
	 * @return the value connected with the key or null if it is not found
	 */
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
		return null;
	}
	
	public List<String> getKeys(){
		ArrayList<String> xList = new ArrayList<String>();
		for (int i = 0; i < myHashMap.length; i++){
			for (int y = 0; y < myHashMap[i].size();y++){
				String myKey = myHashMap[i].get(y).getKey();
				xList.add(myKey);
			}
		
		}
		return xList;
		
	}
	public boolean exists(String key){
		for (int i = 0; i < myHashMap.length; i++){
			for (int y = 0; y < myHashMap[i].size();y++){
				String myKey = myHashMap[i].get(y).getKey();
				if (key.equals(myKey)){
					return true;
				}
			}
		}
		return false;
	}
	public int size(){
		return 0;
	}
	
	
	
	
}
