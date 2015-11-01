package spoj;

import java.util.Scanner;

public class AGameWithNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long numbers = in.nextLong();
		if(numbers%10==0)
			System.out.println("2");
		else
		{
			System.out.println("1");
			System.out.println(numbers%10);
		}	
	}
}