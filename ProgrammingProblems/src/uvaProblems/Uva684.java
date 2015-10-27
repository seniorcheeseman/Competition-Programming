package uvaProblems;

import java.util.Scanner;

public class Uva684 {

	/**
	 *  make matrix  * * *   and multiply diagonal
	 *  			 0 * *
	 *               0 0 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int parts = in.nextInt();
			if(parts ==0)break;
			int[][] deter = new int[parts][parts]; // x = rows, y = columns
			for(int x=0;x<parts;x++)
			{
				for(int y=0; y<parts;y++)
				{
					deter[x][y] =in.nextInt();
				}
			}
			/*
			 * method:use gcd on each column below y,y i.e (0,0) (1,1) (2,2)
			 * gcd works as:  a mod b = a - (a/b) *b, lambda = a/b
			 *  
			 */
			int swapping = 1;
			for(int y=0;y<parts;y++)
			{
				for(int x=y+1;x<parts;x++)
				{
					while(Math.abs(deter[x][y])>0)
					{
					long lambda = deter[y][y]/deter[x][y];// m(1,1)/m(2,1) 
						for(int k=0;k<parts;k++)
						{
							deter[y][k] -=lambda*deter[x][k];// m(1,0)- lambda* m(2,0)
							int temp = deter[x][k]; //swap the two
							deter[x][k]=deter[y][k];
							deter[y][k]=temp;
						}
						swapping*=-1;
					}
				}
			}
			for(int y=0;y<parts;y++)
			{
				swapping*=deter[y][y];
			}
			System.out.println(swapping);
		}
		System.out.println("*");
	}
}
