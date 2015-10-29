package spoj;

import java.util.Scanner;

public class CountonCantor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int x=0; x<times;x++)
		{
			int next = in.nextInt();
			long current = 0;
			long max =0;
			for(long y=1;y<=4472;y++)
			{
				if(max+y>=next)
				{
					current = y;
					break;
				}
				max +=y;
			}
			String res = "TERM "+Integer.toString(next)+ " IS ";
			long temp = next-max;
//			System.out.println(current);
//			System.out.println(temp);
			if(current%2==0)
				res += Long.toString(temp)+"/"+Long.toString(current-temp+1);
			else
				res += Long.toString(current-temp+1)+"/"+Long.toString(temp);
			System.out.println(res);
			
		}
	}

}
