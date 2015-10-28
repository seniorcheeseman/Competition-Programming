package spoj;

import java.util.Scanner;

public class Pour1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		for(int  x=0; x<times;x++)
		{
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			if(c%gcd(a,b)!=0||(a<c&&b<c))
				System.out.println(-1);
			else
			{
				int result = Math.min(simulateJugs(a,b,c),simulateJugs(b,a,c));
				System.out.println(result);
			}
		}

	}
	private static int simulateJugs(int a,int b,int c)
	{
		int result = 0, curra=0, currb=0;
		for (;;) {
			if (curra==c || currb==c) return result;
			if (currb==b) currb=0;
			else if (curra==0) 
				curra = a;
			else {
				int dt = Math.min(b-currb,curra);
	            curra -= dt;
	            currb += dt;
			}
			result++;
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
