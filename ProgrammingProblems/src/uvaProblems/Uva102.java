package uvaProblems;

import java.util.Scanner;

public class Uva102 {
	static int[] list;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			list = new int[9];
			int[] counts = new int[6];
			for(int x=0;x<9;x++)
				list[x]= in.nextInt();
			String[] combs = {"BCG", "BGC", "CBG", "CGB", "GBC", "GCB"};
			// Brown index : 0 3 6
       	 	// Green index : 1 4 7
       	    // Clear index : 2 5 8
			counts[0] = count(0,5,7);//BCG
			counts[1] = count(0,4,8);//BGC
			counts[2] = count(2,3,7);//CBG
			counts[3] = count(2,4,6);//CGB
			counts[4] = count(1,3,8);//GBC
			counts[5] = count(1,5,6);//GCB
			int max =Integer.MAX_VALUE;
			int combNum = 0;
			for(int x=0; x<6;x++)
				if(counts[x]<max)
				{
					max = counts[x];
					combNum = x;
				}
			System.out.println(combs[combNum]+" "+max);
		}
	}
	public static int count(int g, int b,int c)
	{
		int count =0;
		for(int x=0; x<9;x++)
			if(x!=g&&x!=b&&x!=c)
				count+=list[x];
		return count;
	}
}