package spoj;

import java.util.Scanner;

public class WhatsNext {

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
			if(a==0&&b==0&&c==0)break;
			if(c-b==b-a){
				int temp = c-b;
				System.out.println ("AP " + (c+temp));
			}
			if((double)c/b==(double)b/a)
			{
				int temp = c/b;
				System.out.println ("GP "+ (c*temp));
			}
		}
	}

}
