package spoj;

import java.util.Scanner;

public class Candy1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(true)
		{
			int times = input.nextInt();
			if(times==-1)break;
			int[] baggies = new int[times];
			double average =0;
			for(int x=0; x<times;x++)
			{
				int bag = input.nextInt();
				baggies[x] = bag;
				average +=(double)bag;
			}
		    average/=(times);
		    if((average*10)%10!=0)System.out.println(-1);
		    else{
		    	int count =0;
		    	for(int x=0; x<times;x++)
		    	{
		    		if((int)average>baggies[x])
		    			count+= (int)(average)-baggies[x];
		    	}
		    	System.out.println(count);
		    }
		}
	}

}
