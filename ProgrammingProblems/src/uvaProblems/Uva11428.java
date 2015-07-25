package uvaProblems;

import java.util.Scanner;

public class Uva11428 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(true)
		{
			int next = input.nextInt();
			if(next==0)break;
			int x=1;
			int y=1;
			boolean res = false;
			for(;x<=Math.sqrt(next);x++)
			{
				if(x*x*x>next)
				{
					for(y=1; y<x;y++)
					{
						if(x*x*x-y*y*y==next)
						{
							res = true;
							break;
						}
					}
					if(res)break;
				}
			}
			if(res)System.out.println(x + " "+ y);
			else System.out.println("No solution");
		}
	}

}
