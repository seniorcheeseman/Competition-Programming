package spoj;

import java.util.Scanner;

public class AddingReverseNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		for(int x=0; x<times;x++)
		{
			int a = input.nextInt();
			int b = input.nextInt();
			String aS = Integer.toString(a);
			String bS = Integer.toString(b);
			aS = new StringBuilder(aS).reverse().toString();
			bS = new StringBuilder(bS).reverse().toString();
			a = Integer.parseInt(aS);
			b = Integer.parseInt(bS);
			a+=b;
			aS = Integer.toString(a);
			aS = new StringBuilder(aS).reverse().toString();
			a = Integer.parseInt(aS);
			System.out.println(a);
		}
	}
}
