package spoj;

import java.util.Scanner;

public class EasyLongestIncreasingSubsequence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int x=0; x<n;x++)
			a[x]=in.nextInt();
		int res = LIS(a,a.length);
		System.out.println(res);
	}
	
	static int CeilIndex(int A[], int l, int r, int key)
	{
		while(r - l > 1)
		{
			int m = l + (r - l)/2;
            if (A[m]>=key)
                r = m;
            else
                l = m;
		}
		
		return r;
	}
	static int LIS(int[] A, int size)
	{
		 int[] tailTable   = new int[size];
	        int len; // always points empty slot
	 
	        tailTable[0] = A[0];
	        len = 1;
	        for (int i = 1; i < size; i++)
	        {
	            if (A[i] < tailTable[0])
	                // new smallest value
	                tailTable[0] = A[i];
	 
	            else if (A[i] > tailTable[len-1])
	                // A[i] wants to extend largest subsequence
	                tailTable[len++] = A[i];
	 
	            else
	                // A[i] wants to be current end candidate of an existing
	                // subsequence. It will replace ceil value in tailTable
	                tailTable[CeilIndex(tailTable, -1, len-1, A[i])] = A[i];
	        }
	 
	        return len;
	}
}
