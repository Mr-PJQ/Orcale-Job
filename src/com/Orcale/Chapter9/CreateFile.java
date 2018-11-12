package com.Orcale.Chapter9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
	
	public static void createFile() {
		//�ж�D�����Ƿ��С���ѧ���ļ��У���������ڽ��������ļ���
		String s = "D://��ѧ��ҵ";
		File f = new File(s);
		if(!f.exists()) {
			f.mkdir();
		}
		
		//��ѧ�еġ�2016���ļ���
		String year = "2016";
		//2016ת����int���ͣ�����������int�����ж������껹��ƽ��
		int n = Integer.parseInt(year);
		//�ж����ꡢƽ��Ķ��·ݵ�����
		int feb;
		if((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
			feb = 29;
		}else {
			feb = 28;
		}
		//����2016�ļ���
		File y = new File(s, year);
		if(!y.exists()) {
			y.mkdir();
		}
		//��yearPath����2016�ļ��е�·��
		String yearPath = y.getAbsolutePath();
		
		//forѭ����ӡ12����
		for(int m = 1;m <= 12;m++) {
			String p = String.valueOf(m);
			File file = new File(yearPath, p);
			if(!file.exists()) {
				file.mkdir();
			}
			//��ȡÿ�����ļ��е�·��
			String path = file.getAbsolutePath();
			//31��
			if(m == 1||m == 3||m == 5||m == 7||m == 8||m == 10||m == 12) {
//				try {
				for(int d = 1;d <= 31;d++) {
					String chilrPath = String.valueOf(d);
					File childFile = new File(path, chilrPath);
					if(!childFile.exists()) {
						childFile.mkdir();
					}
					//��ȡtxt�ļ������ļ��е�·��
					String txtPath = childFile.getAbsolutePath();
					//��ȡtxt�ļ����ļ���
					String childTxtPath = year + "��" + m + "��" + d + "��" + ".txt";
					//����txt�ļ�����
					File txtFile = new File(txtPath, childTxtPath);
					try {
						//��txt���ļ�����д�룬��д���ļ�����
						FileOutputStream out = new FileOutputStream(txtFile);
						String txt = "����" + year + "��" + m + "��" + d + "��" + "����ҵ";
						out.write(txt.getBytes());
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}else if(m == 4||m == 6||m == 9||m == 11) {//30��
				for(int d = 1;d <= 30;d++) {
					String chilrPath = String.valueOf(d);
					File childFile = new File(path, chilrPath);
					if(!childFile.exists()) {
						childFile.mkdir();
					}
					
					//��ȡtxt�ļ������ļ��е�·��
					String txtPath = childFile.getAbsolutePath();
					//��ȡtxt�ļ����ļ���
					String childTxtPath = year + "��" + m + "��" + d + "��" + ".txt";
					//����txt�ļ�����
					File txtFile = new File(txtPath, childTxtPath);
					try {
						//��txt���ļ�����д�룬��д���ļ�����
						FileOutputStream out = new FileOutputStream(txtFile);
						String txt = "����" + year + "��" + m + "��" + d + "��" + "����ҵ";
						out.write(txt.getBytes());
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			}else {
				//�������·ݵ��������ļ���
				for(int d = 1;d <= feb;d++) {
					String chilrPath = String.valueOf(d);
					File childFile = new File(path, chilrPath);
					if(!childFile.exists()) {
						childFile.mkdir();
					}
					
					//��ȡtxt�ļ������ļ��е�·��
					String txtPath = childFile.getAbsolutePath();
					//��ȡtxt�ļ����ļ���
					String childTxtPath = year + "��" + m + "��" + d + "��" + ".txt";
					//����txt�ļ�����
					File txtFile = new File(txtPath, childTxtPath);
					try {
						//��txt���ļ�����д�룬��д���ļ�����
						FileOutputStream out = new FileOutputStream(txtFile);
						String txt = "����" + year + "��" + m + "��" + d + "��" + "����ҵ";
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
