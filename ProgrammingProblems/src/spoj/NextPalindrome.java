package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class NextPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int times = Integer.parseInt(input.next());
		for(int x=0; x<times;x++)
		{
			String next = input.next();
			int pos = (next.length()-1)/2;
			String res = "";
			StringBuilder build = new StringBuilder(next);
			String middle = "";
			if(next.length()%2==0)
			{
				boolean carry = false;
				
				for(;pos>=0;pos--)
				{
					int left = Character.getNumericValue(build.charAt(pos));
					int right = Character.getNumericValue(build.charAt(build.length()-1-pos));
					if(left<right)
					{
						left++;
						build.setCharAt(pos, Character.forDigit(left, 10));
						break;
					}
					else
					{
						
					}
				}
			}
			else
			{
				
			}
			
			System.out.println(res);
		}
	}

}
