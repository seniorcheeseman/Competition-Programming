package spoj;

import java.util.Scanner;

public class BeehiveNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int next = in.nextInt();
			if(next==-1)break;
			int temp = 1,x =1;
			while(temp<next)
			{
				temp+=6*x;
				x++;
			}
			if(temp==next)System.out.println("Y");
			else System.out.println("N");
		}
	}

}
