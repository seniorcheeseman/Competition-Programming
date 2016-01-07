package uvaProblems;

import java.util.Scanner;

public class Uva750 {
	static int[] row = new int[9];
	static int a, b, solutions;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int x=1; x<=times;x++)
		{
			row = new int[9];
			System.out.println("SOLN       COLUMN");
			System.out.println(" #      1 2 3 4 5 6 7 8\n");
			solutions = 1;
			a = in.nextInt();
			b = in.nextInt();
			backtrack(1);
			if(x!=times)System.out.println();
		}
	}
	public static void backtrack(int col)
	{
		for(int x=1;x<=8;x++)
		{
			if(place(col,x))
			{
				row[col]=x;
				if(col==8&&row[b]==a)
				{
					String res = String.format("%2d     ",solutions);
					solutions++;
					for(int y=1;y<row.length;y++)
					{
						res +=" "+ Integer.toString(row[y]);
					}
					System.out.println(res);
				}
				else backtrack(col+1);
			}
		}
	}
	public static boolean place(int col, int tryrow)
	{
		for(int x=1;x<col;x++)
			if(row[x]==tryrow||(Math.abs(row[x]-tryrow)==Math.abs(x-col)))
				return false;
		return true;
	}
}
