package poj;

import java.util.Scanner;

public class CharmBracelet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int weight = in.nextInt();
		int[] max = new int[weight+1];
		for(int x=0; x<n;x++)
		{
			int cweight = in.nextInt();
			int desire = in.nextInt();
			for(int y=0;y<=weight;y++)
			{
				if(y-cweight>=0)
				{
					if(max[y-cweight]<max[y]+desire)
					{
						max[y-cweight]= max[y]+desire;
					}
				}
			}
		}
		System.out.println(max[0]);
	}

}
