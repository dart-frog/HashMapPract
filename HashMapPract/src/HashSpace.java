import java.util.ArrayList;
import java.util.List;
//static ArrayList<GasCar> myGasCars = new ArrayList();

public class HashSpace {
	List<KeyValuePairs>[] myHashMap;
	public HashSpace(int size){
		myHashMap = new ArrayList[size];  
	}
	public static void add(String key, String value){
		KeyValuePairs x = new KeyValuePairs(key,value);
		int bin = (key.length()*key.charAt(0))  % 10;
	}
	public static void getVal(int ind){
		
	}
	public static void contains(String input){
		
	}
	
	
	
}
