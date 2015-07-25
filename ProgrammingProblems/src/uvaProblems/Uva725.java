package uvaProblems;

import java.util.Scanner;

public class Uva725 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int first =0;
		while (true) {
			Long next = input.nextLong();
			if(first==0)first++;
			else if (next == 0)break;
			else System.out.println();
			int printed = getResults(next);
			if(printed==0) System.out.println("There are no solutions for "+ next +".");
			// System.out.println(a+ " / " + b+ " = " + next);
		}
	}
	public static int getResults(long next)
	{
		int printed= 0;
		for(int f = 0; f<10;f++)
		{
			for(int g =0; g<10;g++)
			{
				if(g!=f)
				{
				for(int h = 0; h<10;h++)
				{
					if(h!=g&&h!=f)
					{
					for(int i=0; i<10;i++)
					{
						if(i!=h&&i!=g&&i!=f)
						{
						for(int j=0; j<10;j++)
						{
							if(j!=i&&j!=h&&j!=g&&j!=f)
							{
								long fghij = f*10000+g*1000+h*100+i*10+j;
								long abcde = next*fghij;
								String a = Long.toString(abcde);
								String b = Long.toString(fghij);
								if(a.length()<5) a = "0" + a;
								if(b.length()<5) b = "0" + b;
								if(checkDifferent(a,b)&&a.length()==5)
								{
									System.out.println(a+ " / " + b+ " = " + next);
									printed++;
								}
							}
						}
						}
					}
					}
				}
				}
			}
		}
		return printed;
	}
	public static boolean checkDifferent(String abcde, String fghij)
	{
		boolean result = true;
		boolean[] nums = new boolean[10];
		String comp = abcde+fghij;
		for(int x=0; x<comp.length();x++)
		{
			if(result)
			{
			char temp = comp.charAt(x);
			int pos = Character.getNumericValue(temp);
			if(nums[pos])result = false;
			nums[pos]= true;
			}
			else break;
		}
		return result;
	}
}
