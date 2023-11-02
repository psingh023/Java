package com.practice.learningfilereader;

import java.io.*;

public class Application {

	public static void main(String[] args) {
		File file = new File("myfile.txt");
		// We are instantiating an instance of file, and we're passing it to the constructor of file reader
		BufferedReader bufferedReader = null;
		// Recommend using the try Catch rather than "throws" it will give error to end user which is not recommended 
		FileReader fileReader = null;
		
		try {
			//FileReader this will accept file as an argument "Read the File"
			//FileReader has ability to be able to read everything in characters files
			fileReader = new FileReader(file);
				//BufferedReader is a buffered character-input stream. This means that it reads characters from a file into a buffer -                     
				//- before returning them to the calling code. This can improve performance by reducing the number of times that the file has to be read from disk.
				//BufferedReader this class has the ability to take the fileReader as an object then and go line by line reading the data.
				//It doesn't read the file in one go
			bufferedReader = new BufferedReader(fileReader);
				//The .readLine() read the line and assign to line variable
				//readLine() will give IOException if there issue reading the file
				//In this scenario we added the Catch to handle the IOException 
			String line = bufferedReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problem reading the file " + file.getName());
			e.printStackTrace();
		} finally {
			try {
				if(bufferedReader != null) {
					bufferedReader.close();
				}
				if(fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				System.out.println("unable to close file " + file.getName());
				e.printStackTrace();
			} 
			catch (NullPointerException ex) {
				// Not recommend to print NullPointerException to user
				System.out.println("File was probably never opened " + ex);
			}
		}

	}

}
