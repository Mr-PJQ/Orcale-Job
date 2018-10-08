package com.Orcale.ChapterThree;

import com.oraclesdp.common.SystemIn;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = SystemIn.nextInt();

		String str = String.valueOf(num);
		char[] a = str.toCharArray();

		int b = a.length;

		int x = 0;
		for (int i = 0; i < b; i++) {
			if (a[i] != a[b - 1 - i]) {
				x++;
			}
		}

		if (x == 0)
			System.out.println(num + "是回环数");
		else
			System.out.println(num + "不是回环数");

	}

}
