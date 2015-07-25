package uvaProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Uva10042 {

	private static int[] isPrime;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		isPrime = generatePrimes(78498);
        int next = input.nextInt();
        for(int x=0; x<next;x++)
        {
        	int number = input.nextInt();
        	number++;
        	while(true)
        	{
	        	int a= valueOfDigits(number);
	        	ArrayList<Integer> primes = primeFactors(number);
	        	int b = 0;
	        	for(int y=0; y<primes.size();y++)
	        	{
	        		b+=valueOfDigits(primes.get(y));
	        	}
	        	
	        	if(a==b&&primes.size()!=1)
	        		{System.out.println(number);
	        		break;
	        		}
	        	number++;
        	}
        	
        }
	}
	public static int valueOfDigits(int value)
	{
		int res = 0;
		while(value!=0)
		{
			res+=value%10;
			value/=10;
		}
		return res;
	}
	public static ArrayList<Integer> primeFactors(int number)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		int current = 0;
		int primeFactor = isPrime[current];
		while(number!=1&&(primeFactor*primeFactor<=number))
		{
			while(number%primeFactor==0)
			{
				number/=primeFactor;
				list.add(primeFactor);
			}
			current++;
			primeFactor = isPrime[current];
		}
		if(number!=1)list.add(number);
		return list;
	}
	private static int [] generatePrimes(int max) {
	    int [] temp = new int [max];
	    temp [0] = 2;
	    int index = 1;
	    int prime = 1;
	    boolean isPrime = false;
	    while((prime += 2) <= max) {
	        isPrime = true;
	        for(int i = 0; i < index; i++) {
	            if(prime % temp [i] == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        if(isPrime) {
	            temp [index++] = prime;
	        }
	    }
	    int [] primes = new int [index];
	    while(--index >= 0) {
	        primes [index] = temp [index];
	    }
	    return primes;
	}
}
