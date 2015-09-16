package uvaProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Uva11286 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int times = in.nextInt();
			if(times==0)break;
			HashMap<String,Integer> pop = new HashMap<String,Integer>();
			int max = 1;
			for(int x=0; x<times;x++)
			{
				String[] cl = new String[5];
				for(int y=0; y<5;y++)
				{
					cl[y] = in.next();
				}
				Arrays.sort(cl);
		        String sorted="";
		        for(int g=0; g<cl.length;g++)
		        {
		        	sorted+=cl[g];
		        }
		        if(pop.containsKey(sorted))
		        {
		        	int temp = pop.get(sorted);
		        	pop.put(sorted,temp+1);
		        	if(temp+1>max)max = temp+1;
		        }
		        else
		        {
		        	pop.put(sorted, 1);
		        }
			}
			int counter = 0;
			for (int value : pop.values()) {
			    if(value==max)counter++;
			}
			counter = counter*max;
			System.out.println(counter);
		}
	}

}
