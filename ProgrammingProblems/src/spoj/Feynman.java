package spoj;

import java.util.Scanner;

public class Feynman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(true)
		{
			int v = input.nextInt();
			if(v==0)break;
			v = v*(v+1)*(2*v+1)/6;
			System.out.println(v);
		}
	}

}
