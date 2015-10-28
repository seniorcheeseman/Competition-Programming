package poj;

import java.util.Scanner;

public class JumpingCows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int numbers = input.nextInt();
		int[] spots = new int[numbers+1];
		int max = 0,min = Integer.MAX_VALUE,answer = 0;
		boolean add = true;
		for(int x=0; x<numbers;x++)
		{
			int next = input.nextInt();
			spots[x+1]=next;
		}
		int i =1;
		while(i<=numbers)
		{
			if(add)
			{
				if(spots[i]>max)
				{
					max = spots[i];
				}
				else add = false;
			}
			if(!add)
			{
				if(spots[i]<min)min = spots[i];
				else
				{
					add = true;
					answer+=max-min;
					max = 0;
					min = Integer.MAX_VALUE;
					continue;
				}
			}
			i++;
		}answer+=max;
		System.out.println(answer);
	}

}
