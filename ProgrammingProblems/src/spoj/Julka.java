package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class Julka {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		for(int x=0; x<10;x++)
		{
			String totA = input.nextLine();
			String diff = input.nextLine();
			BigInteger tots = new BigInteger(totA);
			BigInteger diffs = new BigInteger(diff);
			tots = tots.subtract(diffs);
			tots = tots.divide(BigInteger.valueOf(2));
			System.out.println((tots.add(diffs)).toString());
			System.out.println(tots.toString());
		}
	}
}
