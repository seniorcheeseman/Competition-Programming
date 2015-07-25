package uvaProblems;

import java.util.Scanner;

public class Uva11231 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(true)
		{
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			if(a+b+c==0)break;
			if(c==0)System.out.println((a-7)*(b-7)/2);
			else System.out.println((((a-7)*(b-7))+1)/2);
		}
	}

}
