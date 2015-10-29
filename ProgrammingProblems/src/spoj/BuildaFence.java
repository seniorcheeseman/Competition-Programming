package spoj;

import java.util.Scanner;

public class BuildaFence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int next = in.nextInt();
			if(next==0)break;
			System.out.printf("%.2f\n", next*next/(2*Math.PI));
		}
	}
}
