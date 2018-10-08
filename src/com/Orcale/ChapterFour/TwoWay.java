package com.Orcale.ChapterFour;

import java.util.Random;

public class TwoWay {

	public static void main(String[] args) {

		/**
		 * 获取1-30的随机学生编号
		 */
		int[] b = new int[30];
		Random r = new Random();

		for (int i = 0; i < 30; i++) {
			int x = 0;
			b[i] = r.nextInt(30);

			for (int n = 0; n < i; n++) {
				if (b[i] == b[n])
					x++;
			}
			if (x == 0)
				continue;
			else
				i--;
		}

		/**
		 * 定义二维数组存放值班日和学生编号
		 * 打印输出二维数组
		 */
		int[][] a = new int[2][30];
		
		System.out.print(" 工作日   ：");

		for (int m = 0; m < 2; m++) {
			
			for (int n = 0; n < 30; n++) {
				if (m == 0) {
					a[m][n] = n + 1;
					System.out.print(a[m][n] + " ");
					if(n == 29)
					{
						System.out.println();
						System.out.print("学生编号：");
					}
				} else {
					a[m][n] = b[n] + 1;
					System.out.print(a[m][n] + " ");
				}

			}

		}

	}

}
