import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class RandomLetterGenerator {

	
	static int MAXSIZE = 11;
	static int COUNT = 100;
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		System.out.print(randomize());

	}
	public static String randomize(){
		int rSize = (int) (Math.random() * MAXSIZE);
		StringBuilder mR = new StringBuilder();
		for (int i = 0; i < rSize; i++){
			char x = (char)((Math.random() * 25 + 97));
			mR.append(x);
		}
		return mR.toString();
	}
	public static void printToFile(){
		File myFi = new File("H:\\git\\HashMapPract\\HashMapPract\\input.txt");
		FileWriter myWi = new FileWriter(myFi.getAbsoluteFile());
		BufferedWriter myBu = new BufferedWriter();
	}

}
