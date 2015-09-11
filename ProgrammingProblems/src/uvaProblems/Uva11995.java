package uvaProblems;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Uva11995 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			String end = input.next();
			int times;
			try
			{
			times = Integer.parseInt(end);
			}
			catch(Exception e)
			{
				break;
			}
			ArrayDeque<Integer> monster = new ArrayDeque<Integer>();
			Stack<Integer> gg = new Stack<Integer>();
			Comparator<Integer> comp = Collections.reverseOrder();
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(1,comp);
			boolean qb = true,sb = true,pqb =true;
			for(int x=0; x<times;x++)
			{
				int a = input.nextInt();
				int b = input.nextInt();
				if(a==1)
				{
					monster.add(b);
					gg.add(b);
					pq.offer(b);
				}
				else if(a==2)
				{
					if(qb)
					{
						if(monster.size()==0) qb = false;
						else{
						int temp = monster.remove();
						qb = (temp==b)?true:false;
						}
					}
					if(sb)
					{
						if(gg.size()==0)sb=false;
						else
						{
						int temp = gg.pop();
						sb = (temp==b)?true:false;
						}
					}
					if(pqb)
					{
						if(pq.size()==0)pqb=false;
						else
						{
						int temp = pq.peek();
						pq.remove(temp);
						pqb = (temp==b)?true:false;
						}
					}
				}
			}
			if(qb||sb||pqb)
			{
				int count = 0;
				if(qb)count++;
				if(sb)count++;
				if(pqb)count++;
				if(count>1)
				{
					System.out.println("not sure");
				}
				else{
					if(qb){
						System.out.println("queue");
					}
					else if(sb)
					{
						System.out.println("stack");
					}
					else if(pqb)
					{
						System.out.println("priority queue");
					}
				}
			}
			else
			{
				System.out.println("impossible");
			}
		}
	}
}