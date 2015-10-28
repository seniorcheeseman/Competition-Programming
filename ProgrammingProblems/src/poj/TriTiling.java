package poj;

import java.util.Scanner;

public class TriTiling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] results = new int[31];
		int[] hidden = new int[31];
		results[0]=1; results[1]=0;
		hidden[0]=0;hidden[1]=1;
		for(int x=2;x<=30;x++)
		{
			results[x]= results[x-2]+2*hidden[x-1];
			hidden[x]= results[x-1]+hidden[x-2];
		}
		while(true)
		{
			int next = input.nextInt();
			if(next==-1)break;
			if(next%2==0)
			System.out.println(results[next]);
			else System.out.println(0);
		}
	}

}
