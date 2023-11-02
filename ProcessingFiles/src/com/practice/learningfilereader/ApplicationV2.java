package com.practice.learningfilereader;

import java.io.*;

public class ApplicationV2 {

	public static void main(String[] args) {
		File file = new File("myfile.txt");

		// No need to close the fileReader and bufferedReader this is new to java 7 called "try-with-resources"
		// It closed the resources automatically
		try (FileReader fileReader = new FileReader(file); 
				BufferedReader bufferedReader = new BufferedReader(fileReader); ){
			
			String line = bufferedReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Problem reading the file " + file.getName());

		} 
	}

}
