package com.Orcale.Chapter9;

import java.io.File;

public class FileTree {
	
	public static void file(String path, int ceng) {
		File f = new File(path);
		String[] child = f.list();
		try {
			for(int i = 0;i < child.length;i++) {
				File childFile = new File(path, child[i]);
				ceng = ceng + 10;
				if(childFile.isDirectory()) {
					for(int n = 0;n < ceng;n++) {
						System.out.print(" ");
					}
				
				System.out.println("文件夹----" + childFile.getName());
				file(childFile.getAbsolutePath(), ceng);
				}else {
					for(int n = 0;n < ceng;n++) {
						System.out.print(" ");
					}
					System.out.println("文件****" + childFile.getName());
				}
				ceng = ceng - 10;
			}
		}catch (NullPointerException e) {
		}
	}

	public static void main(String[] args) {
		String path = "E:\\360Downloads";
		file(path, 0);
	}

}
