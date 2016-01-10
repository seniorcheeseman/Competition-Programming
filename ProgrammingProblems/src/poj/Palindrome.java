package poj;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = Integer.parseInt(in.nextLine());
		String next = in.nextLine();
		int[][] bigPali = new int[next.length()][next.length()];
		for(int x=0; x<next.length();x++)
		{
			Arrays.fill(bigPali[x], 1);
		}
		for(int x=0; x<next.length()-1;x++)
		{
			bigPali[x][x+1]= next.charAt(x)==next.charAt(x+1)?2:1;
		}
		for(int len =2;len<next.length();len++)
		{
			for(int x=0; x+len<next.length();x++)
			{
				int y = len+x;
				if(next.charAt(x)==next.charAt(y))
					bigPali[x][y] = 2 + bigPali[x+1][y-1];
				else 
					bigPali[x][y] = Math.max(bigPali[x+1][y],bigPali[x][y-1]);
			}
		}
		if(next.length()-1>=0)
			System.out.println(next.length()-bigPali[0][next.length()-1]);
		else
			System.out.println(next.length());
	}
}
