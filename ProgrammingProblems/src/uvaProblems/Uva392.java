package uvaProblems;

import java.util.Scanner;

public class Uva392 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			String result = "";
			boolean first = false;
			for(int x=8; x>=0;x--)
			{
				int currentNumber = input.nextInt();
				String sign = (currentNumber>0)?" + ":" - ";
				String value = Integer.toString(Math.abs(currentNumber));
				String current =Integer.toString(x);
				if(!first&&currentNumber!=0)
				{
					if(Math.abs(currentNumber)==1)
					{
						if(x==0)
						{
							result =Integer.toString(currentNumber);
						}
						else if(x==1)
						{
							if(currentNumber==1)
								result = "x";
							else result = "-x";
						}
						else
						{
							if(currentNumber==1)
							result = "x^" + current;
							else
							result = "-x^"+ current;
						}
					}
					else
					{
						if(x==0)
						{
							result =Integer.toString(currentNumber);
						}
						else if(x==1)
						{
								result = Integer.toString(currentNumber) +"x";
						}
						else
						result = Integer.toString(currentNumber)+"x^" + current;
					}
					first= true;
				}
				else if(first)
				{
					if(Math.abs(currentNumber)==1)
					{
						if(x==1)
						{
							result += sign + "x";
						}
						else if(x==0)result += sign + value;
						else
						{
							result+= sign +  "x^" + current;
						}
					}
					else if(Math.abs(currentNumber)!=0)
					{
						if(x==0)result += sign + value;
						else if(x==1) result += sign +value + "x";
						else result+= sign + value+ "x^" + current;
					}
				}
			}
			if(result.equals(""))result="0";
			System.out.println(result);
		}
	}
}
