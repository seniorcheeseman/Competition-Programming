package spoj;

import java.util.Scanner;

public class ToAndFro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			String next = input.nextLine();
			if(next.equals("0"))break;
			int times = Integer.parseInt(next);
			
			
			String list = input.nextLine();
//			int mods = list.length()/times;
			String[] results = new String[times];
			for(int x=0; x<results.length;x++)
			{
				results[x] = "";
			}
			boolean right = false;
			
			for(int y=0; y<list.length();y++)
			{
				int temp = y%times;
				if(temp==0)right=!right;
				if(right)
				results[temp]+= list.charAt(y);
				else results[times-temp-1]+= list.charAt(y);
			}
			String res ="";
			for(String temp:results)
			{
				res+=temp;
			}
			System.out.println(res);
			
		}
	}
}
