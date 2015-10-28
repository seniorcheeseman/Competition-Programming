package poj;

import java.util.Arrays;
import java.util.Scanner;

public class PostOffice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int v = in.nextInt();
		int post = in.nextInt();
		int[] vil = new int[302];
		int[][] f = new int[302][32];
		int[][] s = new int[302][302];
		for(int x=1; x<=v;x++)
		{
			vil[x]= in.nextInt();
		}
		for(int i=0;i< f.length;i++)
			Arrays.fill(f[i],1000000);
		 for(int i=1;i< v;i++){
			 	         for(int k=i+1; k <= v; k ++){
			 	            int mid=(i+k)/2;
			 	            for(int j=i;j< mid;j++) s[i][k]+=vil[mid]-vil[j];
			 	            for(int j=mid+1;j<=k;j++) s[i][k]+=vil[j]-vil[mid];
			 	         }
			 	      }
		for(int x=1; x<=v;x++)f[x][1]= s[1][x];
		for(int k=2;k<=post;k++){
			for(int i=1;i<=v;i++){
				for(int j=1;j< i;j++)
				   if(f[j][k-1]+s[j+1][i]< f[i][k]) f[i][k]=f[j][k-1]+s[j+1][i];       
	         }                 
		}
		System.out.println(f[v][post]);
	}

}
