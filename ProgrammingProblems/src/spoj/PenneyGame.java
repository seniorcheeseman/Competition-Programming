package spoj;

import java.util.Scanner;

public class PenneyGame {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int x=0;x<times;x++)
		{
			int next = in.nextInt();
			String seq = in.next();
			System.out.print(next);
			int[] list = new int[8];
			for(int y=0; y<seq.length()-2;y++)
			{
				String temp = seq.substring(y,y+3);
				if(temp.equals("TTT"))list[0]++;
				else if(temp.equals("TTH"))list[1]++;
				else if(temp.equals("THT"))list[2]++;
				else if(temp.equals("THH"))list[3]++;
				else if(temp.equals("HTT"))list[4]++;
				else if(temp.equals("HTH"))list[5]++;
				else if(temp.equals("HHT"))list[6]++;
				else if(temp.equals("HHH"))list[7]++;
			}
			String res = "";
			for(int y=0;y<8;y++)
			{
				res+=" "+ Integer.toString(list[y]);
			}
			System.out.println(res);
		}
	}

}
