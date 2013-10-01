import java.util.ArrayList;


public class HashSpace {
	public HashSpace(int size){
		ArrayList<ArrayList<KeyValuePairs>> hash = new ArrayList(); 
		for(int i = 0; i < size; i++){
			hash.add(ArrayList<KeyValuePairs> i);
		}
	}
	public static void add(String key, String value){
		KeyValuePairs x = new KeyValuePairs(key,value);
		int bin = key.length() % 10;
		
	}
	public static void getVal(int ind){
		
	}
	public static void contains(String input){
		
	}
	
	
	
}
