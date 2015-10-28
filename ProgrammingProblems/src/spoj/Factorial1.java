package spoj;

import java.util.Scanner;


public class Factorial1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		for(int x=0; x<times;x++)
		{
			long next = input.nextLong();
			long result = 0;
			long fives = 5;
			while(fives<=next)
			{
//				result +=(long) Math.floorDiv(next, fives);
				fives*=5;
			}
			System.out.println(result);
		}
	}
}
