package uvaProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class Uva369 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int a = in.nextInt();
			int b= in.nextInt();
			if(a==0&&b==0)break;
			BigInteger out = combination(a,b);
			System.out.println(a+" things taken "+b+" at a time is "+out.toString()+" exactly.");
		}
	}
	
	public static BigInteger combination(int n, int r)
	{
		BigInteger out =BigInteger.valueOf(1);
		BigInteger div = BigInteger.valueOf(1);
		int y = 1;
		for(int x=n;x>n-r;x--)
		{
			if(y<=r)
			{
					div = div.multiply(BigInteger.valueOf(y));
					y++;
			}	
			out = out.multiply(BigInteger.valueOf(x));
		}
		out = out.divide(div);
		return out;
	}

}
