package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class Candy3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long times = input.nextLong();
		for(int x=0; x<times;x++)
		{
			BigInteger n = BigInteger.valueOf(input.nextLong());
			BigInteger total =BigInteger.valueOf(0);
			for(BigInteger y=BigInteger.valueOf(0); y.compareTo(n)==-1;y=y.add(BigInteger.valueOf(1)))
			{
				total= total.add(BigInteger.valueOf(input.nextLong()));
				if(total.compareTo(n)>=0)
				total= total.mod(n);
			}
			if((total.mod(n)).toString().equals("0"))System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
