package uvaProblems;

import java.util.Scanner;

public class Uva384 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		System.out.println("SLURPYS OUTPUT");
		for(int x=0; x<times;x++)
		{
			String next= input.next();
			boolean print = isSlurpy(next);
//			boolean print = false;
//			g++;
//			int gg = slump(next,g);
//			gg++;
//			if(gg==next.length())
//			{
//				print = true;
//			}
			if(print)System.out.println("YES");
			else System.out.println("NO");
		}
		
		System.out.println("END OF OUTPUT");
	}
	public static boolean isSlurpy(String word)
	{
		int g = slimp(word,0);
		if(g!=-1&&g<word.length())
		{
			g = slump(word,g+1);
			if(g!=-1&g==word.length()-1)return true;
		}
		return false;
	}
	public static int slump(String word, int start)
	{
		if(word.charAt(start)!='E'&&word.charAt(start)!= 'D'||start ==-1)
			return -1;
		start++;
		boolean started =false;
		for(; start<word.length()&&word.charAt(start)== 'F';start++)
		{
			started = true;
		}
		if(start>=word.length())return -1;
		else if(word.charAt(start)=='G'&&started)
		{
			return start;
		}
		else if((word.charAt(start)=='E'||word.charAt(start)== 'D')&&started)
		{
			return slump(word,start);
		}
		else
		{
			return -1;
		}
	}
	public static int slimp(String word, int start)
	{
		if(start ==-1)return start;
		if(word.charAt(start)!= 'A')return -1;
		start++;
		if(start>=word.length()){}
		else if(word.charAt(start)== 'H')return start;
		else if(word.charAt(start)=='E'||word.charAt(start)=='D')
		{
			start = slump(word,start);
			if(start!=-1)
			{
				start++;
				if(start<word.length())
				{
					if(word.charAt(start)== 'C')
					{
						return start;
					}
				}
			}
		}
		else if(word.charAt(start)== 'B')
		{
			start++;
			if(start<word.length())
			{
				if(word.charAt(start) == 'A')
				{
			 	start = slimp(word,start);
			 	if(start!=-1)
			 	{
			 		start++;
					if(start<word.length())
					{
						if(word.charAt(start)== 'C')
						{
							return start;
						}
					}
			 	}
				}
			}
		}
		return -1;
	}
	
}
