package spoj;

import java.util.Scanner;

public class Kamil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unused;
		Scanner input = new Scanner(System.in);
		for(int x=0; x<10;x++)
		{
			String word = input.nextLine();
			int result =1;
			for(int y=0; y<word.length();y++)
			{
				if(word.charAt(y)=='T'||word.charAt(y)=='D'||word.charAt(y)=='F'||word.charAt(y)=='L')result*=2;
			}
				System.out.println(result);
		}
	}

}
