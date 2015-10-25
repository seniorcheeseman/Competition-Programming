package uvaProblems;

import java.util.Scanner;

public class Uva11282 {
	static long[] fac;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		fac = new long[21];
		fac[1]=1;
		fac[0]=1;
		for(int x=2;x<=20;x++)
		{
			fac[x]=fac[x-1]*x;
		}
		while(in.hasNext())
		{
			int a = in.nextInt();
			int b = in.nextInt();
			long count = 0;
			for(int x=0; x<=b;x++)
			{
				count+=(fac[a]/(fac[x]*fac[a-x]))*get(a-x);
			}
			System.out.println(count);
		}
	}
	private static long get(int i) {
        long cnt = fac[i];
        int flag = -1;
        for (int j = 1; j <= i; j++) {
            cnt += flag * (fac[i] / (fac[j] * fac[i - j])) * fac[i - j];
            flag *= -1;
        }
        return cnt;
    }

}
