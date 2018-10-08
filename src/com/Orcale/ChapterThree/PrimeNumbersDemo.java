package com.Orcale.ChapterThree;

public class PrimeNumbersDemo {

	public static void main(String[] args) {

		int i = 2;
		int n;
		int sum = 2;
		for(n = 3;n <= 10000;n++)
		{
			int x = 0;
			for( i = 2;i < n;i++)
				{
					while(n%i == 0)
					{
						x++;
						break;
					}
				}
			if(x == 0)
				sum+=n;
		}
		System.out.println(sum);
	}

}
