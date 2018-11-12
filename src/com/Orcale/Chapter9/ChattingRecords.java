package com.Orcale.Chapter9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ChattingRecords {
	public static void main(String[] args) {
		File file = new File("Files/ÁÄÌì¼ÇÂ¼.txt");
		if(!file.exists()) {
			file.mkdir();
		}
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			FileOutputStream out = new FileOutputStream(file, true);
			
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
			
			String message = null;
			while((message = reader.readLine()) != null) {
				if(!message.equals("")) {
					writer.write(message);
					writer.newLine();
					writer.flush();
				}
			}
			writer.close();
			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			
	}
}
