package com.revature.vehicles;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Records {
	public static void recordResults(String winner) throws IOException, FileNotFoundException {
		
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("Records.txt", true));
			writer.write(winner);
			writer.close();
		}
		catch (FileNotFoundException e) {
			Path p;
			try {
				p = Files.createFile(Paths.get("Records.txt"));
				writer = new BufferedWriter(new FileWriter("Records.txt", true));
				writer.write(winner);
				writer.close();
			}
			catch (IOException ex) {
				System.out.println("File Could not be created");
				System.exit(0);
			}
		}
		
		
		
		
	}

}
