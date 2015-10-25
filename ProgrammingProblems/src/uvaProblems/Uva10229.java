package uvaProblems;

import java.util.Scanner;

public class Uva10229 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n = in.nextInt();
			int m = in.nextInt();
			int bob =(int) Math.pow(2, (double)m);
			long[][] res = {{1,0},{0,1}};
			long[][] fib = {{1,1},{1,0}};
			while(n>0)
			{
			if (n%2 == 1) {
                multMatrix(res, fib, bob);
            }
            n = n / 2;
            multMatrix(fib, fib, bob); //
			}
			System.out.println(res[1][0]%bob);
		}
	}
	 private static void multMatrix(long[][] m, long [][] n,int mob) {
	        long a = (m[0][0] * n[0][0] +  m[0][1] * n[1][0])%mob;
	        long b = (m[0][0] * n[0][1] +  m[0][1] * n[1][1])%mob;
	        long c = (m[1][0] * n[0][0] +  m[1][1] * n[0][1])%mob;
	        long d = (m[1][0] * n[0][1] +  m[1][1] * n[1][1])%mob;

	        m[0][0] = a;
	        m[0][1] = b;
	        m[1][0] = c;
	        m[1][1] = d;
	    }

}
