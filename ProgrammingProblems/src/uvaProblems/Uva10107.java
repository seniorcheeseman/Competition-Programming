package uvaProblems;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Uva10107 {
	private static Comparator<Long> comp = Collections.reverseOrder();
	private static PriorityQueue<Long> lower = new PriorityQueue<Long>(1,comp);
	private static PriorityQueue<Long> higher = new PriorityQueue<Long>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		higher.offer((long)Integer.MAX_VALUE);
		lower.offer((long)Integer.MIN_VALUE);
		while(input.hasNext())
		{
			long a = input.nextLong();
			add(a);
			
			if(lower.size()==higher.size())
			{
				System.out.println((lower.peek()+higher.peek())/2);
			}
			else if(lower.size()>higher.size())
			{
				System.out.println(lower.peek());
			}
			else if(lower.size()<higher.size()){
				System.out.println(higher.peek());
			}
		}
	}
	
	public static void add(long input)
	{
		if(input>=higher.peek())
		higher.offer(input);
		else lower.offer(input);
		
		if(higher.size()-lower.size()==2){ 
		      lower.offer(higher.peek());
		      higher.remove();                    
		    } else if(lower.size()-higher.size()==2){ 
		      higher.offer(lower.peek());             
		      lower.remove();                         
		}
	}

}
