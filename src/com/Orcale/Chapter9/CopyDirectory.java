package com.Orcale.Chapter9;

import java.io.File;

public class CopyDirectory {
	
	public static void file(String pathname) {
		File f = new File(pathname);
		String[] file = f.list();
		
		for(int i = 0;i < file.length;i++) {
			File childFile = new File(pathname,file[i]);
			String childPath = childFile.getPath();
			
			if(childFile.isDirectory()) {
				copy(childPath);
				file(childPath);
			}
			
		}
	}
	
	public static void copy(String childPath) {
		String p = "D:";
		File file = new File(p,childPath);
		if(!file.exists()) {
			file.mkdirs();
		}
		
	}
	
	
	public static void main(String[] args) {
		String pathname = "E:/360Downloads";
		file(pathname);
	}
}
