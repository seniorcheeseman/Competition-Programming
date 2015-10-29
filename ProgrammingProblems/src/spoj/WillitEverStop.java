package spoj;

import java.util.Scanner;

public class WillitEverStop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long next = in.nextLong();
		while(next%2==0)
			next/=2;
		if(next==1)
			System.out.println("TAK");
		else
			System.out.println("NIE");
	}

}
