import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
//		for (int i = 0; i <= 3; i++) {
//			Scanner input = new Scanner(System.in);
//			System.out.println("Enter some Text: ");
//			String enteredText = input.nextLine();
//			System.out.println(enteredText);
//
//		}

		File file = new File("myfile.txt");
		Scanner input;
		try {
			input = new Scanner(file);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!!!!");
//			e.printStackTrace();
		}

		MyFileUtils myUtil = new MyFileUtils();
		try {
			System.out.println(myUtil.subtract10FromLargerNumber(12));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
