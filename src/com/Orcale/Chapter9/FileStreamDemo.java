package com.Orcale.Chapter9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("Files/1.txt");
			FileOutputStream out = new FileOutputStream("Files/5.txt");
			
			byte[] data = new byte[1024];
			int length;
			while((length = in.read(data)) != -1) {
				out.write(data);
			}
			
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
