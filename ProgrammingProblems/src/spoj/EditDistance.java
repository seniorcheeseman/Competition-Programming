package spoj;

import java.util.Scanner;

public class EditDistance {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int x=0;x<times;x++)
		{
			String a = in.next(),b =in.next();
			char[] aList = a.toCharArray(),bList = b.toCharArray();
			int[][] dp = new int[a.length()+1][b.length()+1];
			for(int y=0;y<b.length()+1;y++)
				dp[0][y]= y;
			for(int z=0; z<a.length()+1;z++)
				dp[z][0]=z;
			for(int y=1;y<b.length()+1;y++)
			{
				for(int z=1;z<a.length()+1;z++)
				{
					if(bList[y-1]==aList[z-1])
						dp[z][y]= dp[z-1][y-1];
					else
					{
						int temp = Math.min(dp[z-1][y],dp[z-1][y-1]);
						dp[z][y]= Math.min(temp, dp[z][y-1])+1;
					}
				}
			}
			System.out.println(dp[a.length()][b.length()]);
		}
	}

}
