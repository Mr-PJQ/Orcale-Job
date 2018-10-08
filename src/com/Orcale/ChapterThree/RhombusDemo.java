package com.Orcale.ChapterThree;

import com.oraclesdp.common.SystemIn;

public class RhombusDemo {

	public static void main(String[] args) {
		int num = SystemIn.nextInt();		

		char[] a = new char[num];

		int x = (num - 1) / 2;
		
		for (int i = 0; i < num; i++) {
			if (i <= x) {
				a[x - i] = '*';
				a[x + i] = '*';
				System.out.println(a);
			} else {
				a[i - 1 - x] = ' ';
				a[x * 3 + 1 - i] = ' ';
				System.out.println(a);
			}

		}	
	}

}
