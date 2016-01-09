package uvaProblems;

import java.util.Scanner;

public class Uva11085 {
	public static int[] row = new int[9], diff = new int[9];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count =0;
		while(in.hasNext())
		{
			row = new int[9];
			for(int x=1;x<=8;x++)
			{
				diff[x] = in.nextInt();
			}
			count++;
			System.out.println("Case " +count +": "+backtrack(1));
		}
	}
	public static int backtrack(int col)
	{
		int min = Integer.MAX_VALUE;
		for(int x=1;x<=8;x++)
		{
			if(place(col,x))
			{
				row[col]=x;
				int df =0;
				if(col==8)
				{
					df = 0;
					for(int y=1; y<=8;y++)
					{
						if(row[y]!=diff[y])
							df++;
					}
				}
				else
					df = backtrack(col+1);
				min = (min>df)?df:min;
			}
		}
		return min;
	}
	public static boolean place(int col, int tryrow)
	{
		for(int x =1; x<col;x++)
			if(row[x]==tryrow||Math.abs(row[x]-tryrow)==Math.abs(x-col))
				return false;
		return true;
	}
}
