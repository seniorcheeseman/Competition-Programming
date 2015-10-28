package spoj;

import java.util.Scanner;

public class AmbiguousPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(true)
		{
			int times = Integer.parseInt(input.nextLine());
			if(times ==0)break;
			String org = input.nextLine();
			String[] temp = org.split(" ");
			boolean res = true;
			for(int x=0; x<times;x++)
			{
				int next = Integer.parseInt(temp[x])-1;
				if(!temp[next].equals(Integer.toString(x+1))){res =false; break;}
			}
			if(res)
			System.out.println("ambiguous");
			else System.out.println("not ambiguous");
		}
	}

}
