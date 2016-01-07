package codeforces;

import java.util.Scanner;

public class NextRound {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int count = 0;
		int last = Integer.MAX_VALUE;
		for(int x=0; x<n;x++)
		{
			int next = in.nextInt();
			if(next<=0)
				break;
			else if(last==next)
				count++;
			else if(count>=k)
				break;
			else
				count++;
			last = next;
		}
		System.out.println(count);
	}

}
