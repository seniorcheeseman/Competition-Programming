package spoj;

import java.util.Scanner;
import java.util.Stack;

public class StreetParade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int times = in.nextInt();
			if(times==0)break;
			Stack<Integer> s = new Stack<Integer>();
			int value =1;
			boolean good = true;
			for(int x=0; x<times;x++)
			{
				int next = in.nextInt();
				while(!s.empty()&&s.peek()==value)
				{
					value++;
					s.pop();
				}
				if(next!=value)
				{
					if(!s.isEmpty())
					{
						if(s.peek()<next)
							good = false;
						else
							s.push(next);
					}
					else
						s.push(next);
				}
				else value++;
			}
			if(good)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}

}
