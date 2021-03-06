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
		printToFile();

	}
	public static String randomize(){
		int rSize = (int) ((Math.random() * (MAXSIZE)) + 1);
		StringBuilder mR = new StringBuilder();
		for (int i = 0; i < rSize; i++){
			char x = (char)((Math.random() * 25 + 97));
			mR.append(x);
		}
		return mR.toString();
	}
	public static void printToFile(){
		File myFi = new File("input.txt");
		try{
			FileWriter myWi = new FileWriter(myFi.getAbsoluteFile());
			BufferedWriter out = new BufferedWriter(myWi);
			for(int i = 1; i <= COUNT; i++){
				out.write(randomize() + " " + randomize() + "\n");
			}
			out.close();
		}
		
		catch(Exception e){
			System.out.print(e);
		}
	}

}
