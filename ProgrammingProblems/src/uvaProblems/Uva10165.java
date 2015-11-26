package uvaProblems;

import java.util.Scanner;

public class Uva10165 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int n = in.nextInt();
			if(n==0)break;
			int[] list = new int[n];
			for(int x=0;x<n;x++)
				list[x]=in.nextInt();
			int nim = 0;
			for(int x=0; x<n;x++)
			{
				nim=nim^list[x];
			}
			if(nim!=0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
