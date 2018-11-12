package com.Orcale.Chapter9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
	
	public static void createFile() {
		//判断D盘下是否有“大学”文件夹，如果不存在将创建该文件夹
		String s = "D://大学作业";
		File f = new File(s);
		if(!f.exists()) {
			f.mkdir();
		}
		
		//大学中的“2016”文件夹
		String year = "2016";
		//2016转换成int类型，便于下面用int类型判断是闰年还是平年
		int n = Integer.parseInt(year);
		//判断闰年、平年的二月份的天数
		int feb;
		if((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
			feb = 29;
		}else {
			feb = 28;
		}
		//创建2016文件夹
		File y = new File(s, year);
		if(!y.exists()) {
			y.mkdir();
		}
		//用yearPath接收2016文件夹的路径
		String yearPath = y.getAbsolutePath();
		
		//for循环打印12个月
		for(int m = 1;m <= 12;m++) {
			String p = String.valueOf(m);
			File file = new File(yearPath, p);
			if(!file.exists()) {
				file.mkdir();
			}
			//获取每个月文件夹的路径
			String path = file.getAbsolutePath();
			//31天
			if(m == 1||m == 3||m == 5||m == 7||m == 8||m == 10||m == 12) {
//				try {
				for(int d = 1;d <= 31;d++) {
					String chilrPath = String.valueOf(d);
					File childFile = new File(path, chilrPath);
					if(!childFile.exists()) {
						childFile.mkdir();
					}
					//获取txt文件所在文件夹的路径
					String txtPath = childFile.getAbsolutePath();
					//获取txt文件的文件名
					String childTxtPath = year + "年" + m + "月" + d + "日" + ".txt";
					//创建txt文件对象
					File txtFile = new File(txtPath, childTxtPath);
					try {
						//将txt的文件对象写入，并写入文件内容
						FileOutputStream out = new FileOutputStream(txtFile);
						String txt = "这是" + year + "年" + m + "月" + d + "日" + "的作业";
						out.write(txt.getBytes());
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}else if(m == 4||m == 6||m == 9||m == 11) {//30天
				for(int d = 1;d <= 30;d++) {
					String chilrPath = String.valueOf(d);
					File childFile = new File(path, chilrPath);
					if(!childFile.exists()) {
						childFile.mkdir();
					}
					
					//获取txt文件所在文件夹的路径
					String txtPath = childFile.getAbsolutePath();
					//获取txt文件的文件名
					String childTxtPath = year + "年" + m + "月" + d + "日" + ".txt";
					//创建txt文件对象
					File txtFile = new File(txtPath, childTxtPath);
					try {
						//将txt的文件对象写入，并写入文件内容
						FileOutputStream out = new FileOutputStream(txtFile);
						String txt = "这是" + year + "年" + m + "月" + d + "日" + "的作业";
						out.write(txt.getBytes());
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			}else {
				//创建二月份的天数的文件夹
				for(int d = 1;d <= feb;d++) {
					String chilrPath = String.valueOf(d);
					File childFile = new File(path, chilrPath);
					if(!childFile.exists()) {
						childFile.mkdir();
					}
					
					//获取txt文件所在文件夹的路径
					String txtPath = childFile.getAbsolutePath();
					//获取txt文件的文件名
					String childTxtPath = year + "年" + m + "月" + d + "日" + ".txt";
					//创建txt文件对象
					File txtFile = new File(txtPath, childTxtPath);
					try {
						//将txt的文件对象写入，并写入文件内容
						FileOutputStream out = new FileOutputStream(txtFile);
						String txt = "这是" + year + "年" + m + "月" + d + "日" + "的作业";
						out.write(txt.getBytes());
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
			createFile();
	}

}
