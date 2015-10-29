package spoj;
/*
 * Note: This solution will get TLE because the time constraints are silly for this problem.
 * 		 Had to transfer to C++ to get AC.
 */
import java.util.Scanner;
public class APCompleteThisSeries {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int x=0; x<times;x++)
		{
			long g = in.nextLong();
			long h = in.nextLong();
			long t = in.nextLong();
			long number = 2*t/(h+g);
			long diff = (h-g)/(number-5);
			long start = g-2*diff;
			System.out.println(number);
			for(int y=0;y<number;y++)
			{
				if(y!=number-1)
					System.out.print(start +" ");
				else
					System.out.println(start);
				start+=diff;
			}
			System.out.println();
		}
	}

}
