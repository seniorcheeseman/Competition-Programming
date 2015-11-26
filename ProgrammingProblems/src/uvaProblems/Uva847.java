package uvaProblems;

import java.util.Scanner;

public class Uva847 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			long n = in.nextLong();
			long p = 1;
			int count = 0;
			while(p<n)
			{
				if(count%2==0)p*=9;
				else p*=2;
				count++;
			}
			if(count%2==1)System.out.println("Stan wins.");
			else System.out.println("Ollie wins.");
		}
	}

}
