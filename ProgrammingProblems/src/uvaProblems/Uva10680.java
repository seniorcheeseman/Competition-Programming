package uvaProblems;

import java.util.Scanner;

public class Uva10680 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] lastDigit = new int[1000000001];
		long digit = 1;
		for(long x =1;x<=1000000000;x++)
		{
			digit = lcm(digit,x%10);
			lastDigit[(int)x] =(int) digit%10;
			
		}
		while(true){
			int times = input.nextInt();
			if(times==0)break;
			System.out.println(lastDigit[times]);
		}
	}

	public static long lcm(long a, long b)
	{
		return (a*(b/gcd(a,b)));
	}
	
	public static long gcd(long a, long b)
	{
		return b==0?a:gcd(b,a%b);
	}
}
