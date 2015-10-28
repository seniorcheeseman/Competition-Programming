package spoj;

import java.util.ArrayList;
import java.util.Scanner;

public class primeGenerator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		for(int y=0; y<times;y++)
		{
			long lower= input.nextLong();
			long upperBound = input.nextLong();
			ArrayList<Long> res = new ArrayList<Long>();
			for(long x =lower;x<=upperBound;x++)
			{
				if(isPrime(x))res.add(x);
			}
			for(long t: res)
			{
				System.out.println(t);
			}
			System.out.println();
		}
	}
	public static boolean isPrime(long n) {
	    if (n <= 3) {
	        return n > 1;
	    } else if (n % 2 == 0 || n % 3 == 0) {
	        return false;
	    } else {
	        double sqrtN = Math.floor(Math.sqrt(n));
	        for (int i = 5; i <= sqrtN; i += 6) {
	            if (n % i == 0 || n % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
}
