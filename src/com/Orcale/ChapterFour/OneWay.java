package com.Orcale.ChapterFour;

import java.util.Arrays;
import java.util.Random;

public class OneWay {

	public static void main(String[] args) {

		/**
		 * 定义数组，随机数
		 */
		int[] a = new int[30];
		Random r = new Random();

		for (int i = 0; i < 30; i++) {
			/**
			 * 将100以内的随机数写入数组
			 */
			int x = 0;
			a[i] = r.nextInt(100);

			/**
			 * 判断随机输入的数与前面的数是否相同
			 */
			for (int n = 0; n < i; n++) {
				if (a[i] == a[n])
					x++;
			}
			if (x == 0)
				continue;
			else
				i--;
		}

		/**
		 * 降序输出
		 */
		Arrays.sort(a);
		for (int m = a.length - 1; m >= 0; m--) {
			System.out.print(a[m] + " ");
		}

	}

}
