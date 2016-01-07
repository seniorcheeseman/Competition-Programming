package uvaProblems;

import java.util.Scanner;

public class Uva167 {
	static int[] row = new int[9];
	static int[][] board;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		board = new int[9][9];
		for(int x=0; x<times;x++){
			for(int y=1;y<9;y++)
				for(int z=1;z<9;z++)
					board[y][z]=in.nextInt();
//			for(int y=1;y<9;y++)
//			{
//				for(int z=1;z<9;z++)
//					System.out.print(" "+board[y][z]);
//				System.out.println();
//			}
			int score = backtrack(1);
			System.out.format("%5d",score);
			System.out.println();
		}
	}
	public static int backtrack(int col)
	{
		int max = 0;
		for(int x=1;x<=8;x++)
		{
			if(place(col,x))
			{
				row[col]=x;
				int temp = 0;
				if(col==8)
				{
					for(int y=1; y<=8;y++)
					{
						int add = board[y][row[y]];
						temp += add;
					}
//					if(temp>0)
//					{
//						for(int y=1;y<=8;y++)
//							System.out.print(row[y]+ " ");
//						System.out.println(temp);
//					}
				}
				else
					temp =backtrack(col+1);
				max = (max>temp)?max:temp;
			}
		}
		return max;
	}
	public static boolean place(int col, int tryrow)
	{
		for(int x=1;x<col;x++)
			if(row[x]==tryrow||(Math.abs(row[x]-tryrow)==Math.abs(x-col)))
				return false;
		return true;
	}
}
