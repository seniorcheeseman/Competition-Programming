package uvaProblems;

import java.util.Scanner;

public class Uva294 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		for(int x=0; x<times;x++)
		{
			long a = input.nextLong();
			long b = input.nextLong();
			long largest = 0;
			long numbers = 0;
			for(long temp = a;temp<=b;temp++)
			{
				long current = getDivisors(temp);
				if(current>numbers)
				{
					largest = temp;
					numbers=current;
				}
			}
			System.out.println("Between "+a+" and "+b+", "+largest+" has a maximum of "+numbers+" divisors.");
		}
	}
	
	public static int getDivisors(long number)
	{
		int res = 0;
		for(long x=1;x<=Math.sqrt(number);x++)
		{
			if(number%x==0)
			{
				res++;
				if(number/x!=x)res++;//squares only count as one
			}
		}
		return res;
	}

}
