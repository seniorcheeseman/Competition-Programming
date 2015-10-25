package uvaProblems;

import java.util.Scanner;

public class Uva10717 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int n =in.nextInt(),t = in.nextInt();
			if(n==0&&t==0)break;
			long[] cents = new long[n];
			for(int x=0; x<n;x++)
				cents[x]=in.nextInt();
			for(int x=0; x<t;x++)
			{
				long next = in.nextInt();
				long larger = Integer.MAX_VALUE, lesser =Integer.MIN_VALUE;
				for(int g =0; g<n;g++)
				{	
					for(int k =g+1; k<n;k++)
					{
						for(int j = k+1;j<n;j++)
						{
							for(int y =j+1;y<n;y++)
							{
								long[] c = new long[4];
								c[0]=cents[g];
								c[1]=cents[k];
								c[2]=cents[j];
								c[3]=cents[y];
								long lcm =lcm(c);
								long less =(next/ lcm) * lcm;
								long more = less == next ? next : less + lcm;
								lesser = Math.max(lesser, less);
								larger = Math.min(larger, more);
							}
						}
					}
				}
				System.out.println(lesser + " "+larger);
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
	  private static long lcm(long a, long b)
	  {
	      return a * (b / gcd(a, b));
	  }

	  private static long lcm(long[] input)
	  {
	      long result = input[0];
	      for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
	      return result;
	  }
}
