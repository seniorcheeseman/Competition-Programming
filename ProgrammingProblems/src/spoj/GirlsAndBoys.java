package spoj;

import java.util.Scanner;

/**
 * 
 * @author Arthur Li
 * The logic for this problem is very simple. It requires you to figure out a simple formula to solve it.
 * First the limiting factor is the smaller group between boys and girls
 * Ex.  5 boys, 2 girls
 * 		BB G BB G B
 * Notice that there are 3 groups of boys which is n+1 of the number of girls.
 * Now use that fact to do solve the problem.
 */
public class GirlsAndBoys {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int b = in.nextInt();
			int g = in.nextInt();
			if(b==-1&&g==-1)break;
			double temp = Math.min(b,g)+1;
			double max = Math.max(b,g);
			int res = (int) Math.ceil(max/temp);
			System.out.println(res);
		}
	}

}
