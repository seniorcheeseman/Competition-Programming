package poj;
import java.util.Scanner;


public class HerdSums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long herds = input.nextLong();
		int results = 1;
		for(long x =1; x<=herds/2;x++)
		{
			long mass = x;
			for(long y=x+1;y<herds;y++)
			{
				mass+=y;
				if(mass==herds)
				{
					results++;
					break;
				}
				else if(mass>herds)break;
			}
		}
		System.out.println(results);
	}

}
