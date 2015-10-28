package spoj;

import java.util.Scanner;

public class Rectangles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int res = input.nextInt();
		int total = 0;
		for(int x=1;x<=Math.sqrt(res);x++)
	        for(int y=x+1;x*y<=res;y++)
	        	total++;
		total+=Math.sqrt(res);
		System.out.println(total);
	}

}
