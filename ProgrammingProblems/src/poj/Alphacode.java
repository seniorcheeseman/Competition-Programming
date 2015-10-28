package poj;

import java.util.Scanner;

public class Alphacode {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			String next = in.next();
			if(next.equals("0"))break;
			long[] results = new long[next.length()+2];
			results[0]=1;
			int current,previous;
			for(int x=0;x<next.length();x++)
			{
				current = Character.getNumericValue(next.charAt(x));
				if(x==0)
				{
					if(x+1<next.length())
					{
						int after =Character.getNumericValue(next.charAt(x+1));
						if(after==0)
						{
							continue;
						}
					}
					results[x+1]=results[x];continue;
				}
				if(x+1<next.length())
				{
					int after =Character.getNumericValue(next.charAt(x+1));
					if(after==0)
					{
						results[x+1]=results[x];continue;
					}
					else
					{
						previous = Character.getNumericValue(next.charAt(x-1));
						if(previous!=0)
						{
						int temp = previous*10+current;
						if(temp<=26)
						{
							results[x+1]+=results[x-1];
						}
						}
					}
				}
				else
				{
					previous = Character.getNumericValue(next.charAt(x-1));
					if(previous!=0)
					{
						int temp = previous*10+current;
						if(temp<=26)
						{
							results[x+1]+=results[x-1];
						}
					}
				}
				if(current!=0)
				results[x+1]+=results[x];
			}
			System.out.println(results[next.length()]);
		}
	}
}
