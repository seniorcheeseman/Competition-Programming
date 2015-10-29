package spoj;

import java.util.Arrays;
import java.util.Scanner;

public class Stamps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int x=1;x<=times;x++)
		{
			String res = "Scenario #"+Integer.toString(x)+":\n";
			int max = in.nextInt();
			int num = in.nextInt();
			int[] number = new int[num];
			for(int y=0; y<num;y++)
			{
				number[y]=in.nextInt();
			}
			Arrays.sort(number);
			int count =0;
			for(int y=number.length-1; y>=0;y--)
			{
				max-=number[y];
				count++;
				if(max<=0)break;
			}
			if(max>0)
				res+="impossible";
			else
				res+=Integer.toString(count);	
			res+="\n";
			System.out.println(res);
		}
	}

}
