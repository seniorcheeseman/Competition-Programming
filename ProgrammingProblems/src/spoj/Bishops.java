package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class Bishops {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			BigInteger times =new BigInteger(in.next());
			if(times.compareTo(BigInteger.valueOf(1))==0)
				System.out.println(1);
			else
			System.out.println(times.subtract(BigInteger.valueOf(1)).multiply(BigInteger.valueOf(2)));
		}
	}

}
