package com.Orcale.Chapter9;

import java.io.File;
import java.nio.file.Path;

public class FileTree {
	static String p = "E:\\360Downloads";
	static File f = new File(p);
	
	public static void file(Path p) {
		String[] child = f.list();
		for(int i = 0;i < child.length;i++) {
			File f = new File(child[i]);
			if(f.isFile()) {
				
			}else {
				
			}
			
		}
	}

	public static void main(String[] args) {
		
	}

}
