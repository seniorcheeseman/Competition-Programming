package spoj;

import java.util.Scanner;

public class PhilosophersStone {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int x=0; x<times;x++)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			int[][] board = new int[b][a],added = new int[b][a];
			for(int y=0; y<b;y++)
			{
				for(int z=0; z<a;z++)
				{
					board[y][z]=in.nextInt();
				}
			}
			for(int y=0; y<b;y++)
			{
				for(int z=0; z<a;z++)
				{
					
				}
			}
		}

	}

}
