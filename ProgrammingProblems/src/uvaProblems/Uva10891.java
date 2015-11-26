package uvaProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Uva10891 {
	static int[] prevsum,list;
	static int[][] dp;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int next = in.nextInt();
			if(next==0)break;
			list = new int[next];
			prevsum = new int[next];
			list[0]=prevsum[0]=in.nextInt();
			for(int x=1;x<next;x++)
			{
				list[x]=in.nextInt();
				prevsum[x]= prevsum[x-1]+list[x];
			}
			dp = new int[next][next];
			for(int x=0; x<next;x++)
				Arrays.fill(dp[x], Integer.MIN_VALUE);
			int res = solveBest(0,next-1);
			System.out.println(res);
		}
	}
	public static int solveBest(int i, int j) {
		if(i>j)return 0;
		if(dp[i][j]!=Integer.MIN_VALUE)return dp[i][j];
		int best = Integer.MIN_VALUE;
		for(int x=i;x<=j;x++)
			best = Math.max(best, getValue(i,x)-solveBest(x+1,j));
		for(int x=j;x>=i;x--)
			best = Math.max(best, getValue(x,j)-solveBest(i,x-1));
		dp[i][j]=best;
		return best;
	}
	public static int getValue(int i, int j) {
        return prevsum[j] - prevsum[i] + list[i];
    }
	
}
