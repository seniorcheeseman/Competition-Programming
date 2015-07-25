package uvaProblems;

import java.util.Scanner;

public class Uva10346 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			int a = input.nextInt();
			int b = input.nextInt();
			int temp = a;
			int counter = 0;
			while(temp>0)
			{
				if(temp/b>0)
				{
					int g = temp/b;
					temp-=g*b;
					temp+=g;
					counter+=g;
				}
				else break;
			}
			System.out.println(a+counter);
		}
	}

}
