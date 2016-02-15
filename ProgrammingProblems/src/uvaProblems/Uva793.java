package uvaProblems;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Uva793 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = Integer.parseInt(in.nextLine());
		in.nextLine();
		for(int x =0; x<times;x++)
		{
			int number = Integer.parseInt(in.nextLine()), correct=0, wrong=0;
			UnionFind find = new UnionFind(number);
			while(in.hasNext())
			{
				String parser = in.nextLine();
				if(parser.length()==0)break;
				StringTokenizer temp = new StringTokenizer(parser);
				String c =temp.nextToken();
				int a = Integer.parseInt(temp.nextToken());
				int b = Integer.parseInt(temp.nextToken());
				if(c.equals("c"))
					find.unionSet(a-1, b-1);
				else if(c.equals("q"))
				{
					if(find.isSameSet(a-1, b-1))
						correct++;
					else
						wrong++;
				}
			}
			System.out.println(correct+","+wrong);
			if(x!=times-1)
			System.out.println();
		}
	}
	public static class UnionFind{
		private ArrayList<Integer> p, rank, setSize;
		private int numSets;
		public UnionFind(int n)
		{
			p = new ArrayList<Integer>(n);
			rank = new ArrayList<Integer>(n);
			setSize = new ArrayList<Integer>(n);
			numSets = n;
			for(int x=0; x<n;x++)
			{
				p.add(x);
				rank.add(0);
				setSize.add(1);//every number is it own set
			}
		}
		public int numDisjointSets()
		{
			return numSets;
		}
		public boolean isSameSet(int i, int j)
		{
			return (findSet(i)==findSet(j));
		}
		public int findSet(int x)
		{
			if(p.get(x)==x)
				return x;
			else
			{
				int ret = findSet(p.get(x));
				p.set(x, ret);
				return ret;
			}
		}
		public void unionSet(int x, int y)
		{
			if(!isSameSet(x,y))
			{
				numSets--;
				int t = findSet(x), g = findSet(y);
				if(rank.get(t)>rank.get(g))
				{
					p.set(g,t);
					setSize.set(t,setSize.get(t)+setSize.get(g));
				}
				else
				{
					p.set(t, g);
					setSize.set(g,setSize.get(t)+setSize.get(g));
					if(rank.get(g)==rank.get(t))
						rank.set(g, rank.get(g)+1);
				}
			}				
		}
	}
}