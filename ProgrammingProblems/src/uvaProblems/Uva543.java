package uvaProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Uva543 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		sieve(10000000);
		while(true)
		{
			int next = in.nextInt(),a = -1,b=-1;
			if(next ==0)break;
			for(int x=0; x<primes.size()&&a<=next/2;x++)
			{
				a= primes.get(x);
				int temp = next-a;
				if(bs[temp]){
					b = temp;
					break;
				}
			}
			if(b==-1)
			{
				System.out.println("Goldbach's conjecture is wrong.");
			}
			else
			{
				System.out.println(next+" = "+a+" + "+b);
			}
		}
	}
	static int _sieve_size;
	static  boolean[] bs;   // 10^7 should be enough for most cases
	static  List<Integer> primes = new ArrayList<Integer>();   // compact list of primes in form of vector<int>

	static void sieve(int upperbound) {          // create list of primes in [0..upperbound]
	    _sieve_size = upperbound + 1;                   // add 1 to include upperbound
	    bs = new boolean[_sieve_size];
	    Arrays.fill(bs,true);                                    // set all bits to 1
	    bs[0] = bs[1] = false;                                     // except index 0 and 1
	    for (long i = 2; i < _sieve_size; i++) if (bs[(int)i]) {
	      // cross out multiples of i starting from i * i!
	      for (long j = i * i; j < _sieve_size; j += i) bs[(int)j] = false;
	      primes.add((int)i);  // also add this vector containing list of primes
	  }
	}
}
