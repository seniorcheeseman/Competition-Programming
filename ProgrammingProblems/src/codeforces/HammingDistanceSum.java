package codeforces;

import java.util.Scanner;

public class HammingDistanceSum {
	
	public static void main(String[] args) {
		int incomplete = 0;
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		int count = 0;
		int[] one = new int[a.length()+2];
		int[] zero = new int[a.length()+2];
		int ones = 0;
		int zeroes = 0;
		for(int x=0;x<a.length();x++)
		{
			if(a.charAt(x)=='0')
				zeroes++;
			else
				ones++;
			one[x]=ones;
			zero[x]=zeroes;
		}
		if(a.length()==b.length())
		{
			for(int x=0;x<a.length();x++)
			{
					if(a.charAt(x)!=b.charAt(x))
						count++;
			}
		}
		else
		{
			for(int x=0;x<a.length();x++)
			{
				if(b.charAt(x)=='0')
					count+=one[x];
				else
					count+=zero[x];
			}
			for(int x=a.length(); x<b.length()-a.length()+1;x++)
			{
				String temp = b.substring(x,x+1);
				if(temp.equals("0")){
					count+=ones;
				}
				else if(temp.equals("1")){
					count+=zeroes;
				}
			}
			for(int x=b.length()-a.length()+1;x<b.length();x++)
			{
				int temp = x-(b.length()-a.length());
				if(b.charAt(x)=='0')
				{
					count+=(one[a.length()-1]-one[temp-1]);
				}
				else
					count+=(zero[a.length()-1]-zero[temp-1]);
			}
		}
		System.out.println(count);
	}
}