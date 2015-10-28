package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial2 {
	public static BigInteger[] factorials = new BigInteger[101];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		factorials[0] = new BigInteger("1");
		for(int x=0; x<times;x++)
		{
			int facs = input.nextInt();
			
			BigInteger result = getFac(facs);
			System.out.println(result.toString());
		}
	}
	public static BigInteger  getFac(int fac)
	{
		if(factorials[fac-1]==null) factorials[fac-1]=getFac(fac-1).multiply(new BigInteger((Integer.toString(fac))));
		BigInteger result = factorials[fac-1];
		return result;
	}
}
