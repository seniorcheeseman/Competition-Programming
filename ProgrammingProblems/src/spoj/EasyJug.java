package spoj;

import java.util.Scanner;

public class EasyJug {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		for(int  x=0; x<times;x++)
		{
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			if(c%gcd(a,b)!=0||(a<c&&b<c))
				System.out.println("NO");
			else
			{
				System.out.println("YES");
			}
		}
	}
	private static long gcd(long a, long b)
	  {
	      while (b > 0)
	      {
	          long temp = b;
	          b = a % b; // % is remainder
	          a = temp;
	      }
	      return a;
	  }

}
