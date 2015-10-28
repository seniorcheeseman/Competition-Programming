package spoj;

import java.util.Scanner;

public class LastDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		for(int x=0; x<times;x++)
		{
			int a = input.nextInt();
			int b = input.nextInt();
			if(b ==0)
				System.out.println(1);
			else
			{
			int g = (b%4==0)?4:b%4;
			a = a%10;
			int result= a;
			for(int y=0; y<g-1;y++)
			{
				result = (result*a)%10;
			}
			
			 System.out.println(result);
			 }
			
		}
	}

}
