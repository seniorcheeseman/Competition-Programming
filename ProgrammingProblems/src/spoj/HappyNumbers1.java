package spoj;

import java.util.Scanner;

public class HappyNumbers1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int next = in.nextInt();
		boolean[] used = new boolean[800];
		int times = 0;
		while(next!=1)
		{
			int temp = 0;
			while(next!=0)
			{
				int p = next%10;
				temp+=p*p;
				next/=10;
			}
			if(!used[temp])used[temp]=true;
			else break;
			next = temp;
			times++;
		}
		if(next!=1)System.out.println("-1");
		else System.out.println(times);

	}

}
