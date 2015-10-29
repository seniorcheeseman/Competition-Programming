package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountingTriangles {
	public static void main(String[] args) throws Exception {
		BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(i.readLine());
		for(int x=0; x<t;x++)
		{
			long n = Long.parseLong(i.readLine());
			long r=0;
			if(n%2==0)
				r +=(n*(n+2)*((2*n)+1))/8;
			else
				r +=((n*(n+2)*((2*n)+1))-1)/8;
			System.out.println(r);
		}
	}
}