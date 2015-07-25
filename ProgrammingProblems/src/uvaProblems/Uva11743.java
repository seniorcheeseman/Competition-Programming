package uvaProblems;

import java.util.Scanner;

public class Uva11743 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		for(int x=0; x<times;x++)
		{
			String digits="";
			for(int y=0; y<4;y++)
			{
				digits += input.next();
			}
			int result =0; 
			for(int y=0; y<digits.length();y++)
			{
				int res = Character.getNumericValue(digits.charAt(y));
				if(y%2==0)
				{
					res *=2;
					while(res!=0)
					{
						result+= res%10;
						res = res/10;
					}
				}
				else result+=res;
			}
			if(result%10==0)System.out.println("Valid");
			else System.out.println("Invalid");
		}
	}

}
