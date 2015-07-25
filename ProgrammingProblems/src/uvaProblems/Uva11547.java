package uvaProblems;

import java.util.Scanner;

public class Uva11547 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		for(int x=0; x<times;x++)
		{
			int next = input.nextInt();
			int res = ((((next*63+7492)*5)-498)/10)%10;
			System.out.println((res<0)?-res:res);
		}
	}

}
