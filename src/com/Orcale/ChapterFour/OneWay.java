package com.Orcale.ChapterFour;

import java.util.Arrays;
import java.util.Random;

public class OneWay {

	public static void main(String[] args) {

		/**
		 * �������飬�����
		 */
		int[] a = new int[30];
		Random r = new Random();

		for (int i = 0; i < 30; i++) {
			/**
			 * ��100���ڵ������д������
			 */
			int x = 0;
			a[i] = r.nextInt(100);

			/**
			 * �ж�������������ǰ������Ƿ���ͬ
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
		 * �������
		 */
		Arrays.sort(a);
		for (int m = a.length - 1; m >= 0; m--) {
			System.out.print(a[m] + " ");
		}

	}

}
