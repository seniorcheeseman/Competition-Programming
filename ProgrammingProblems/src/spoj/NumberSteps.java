package spoj;

import java.util.Scanner;

public class NumberSteps {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		for(int x=0; x<times;x++)
		{
			int a= input.nextInt();
			int b= input.nextInt();
			if(a%2==b%2&&b<=a&&b+2>=a)
			{
				System.out.println(a+b-a%2);
			}
			else System.out.println("No Number");
		}
	}

}
