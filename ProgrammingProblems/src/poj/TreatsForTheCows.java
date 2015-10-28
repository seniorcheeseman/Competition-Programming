package poj;

import java.util.Scanner;
import java.util.HashMap;
public class TreatsForTheCows {
	public static long[][] gg;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		int[] values = new int[times];
		String pos = "";
		gg = new long[times+1][times+1];
		for(int x=0; x<times;x++)
		{
			values[x]=in.nextInt();
		}
		long res = treatCows(values,1,0,times-1);
		System.out.println(res);
	}
	
	public static long treatCows(int[] in, int turn,int start, int end)
	{
		if(start>=end)return in[start]*turn;
		long res = 0;
		if(gg[start][end]>0)
		{
			return gg[start][end];
		}
		else
		{
			int a = in[start];
			int b = in[end];
			long right = a*turn+treatCows(in,turn+1,start+1,end);
			long left = b*turn+treatCows(in,turn+1,start,end-1);
			res = Math.max(right,left);
		}
		gg[start][end]=res;
		return res;
	}

}
