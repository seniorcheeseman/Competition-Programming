package uvaProblems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Uva11503 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int x=0; x<times;x++)
		{
			int num = in.nextInt();
			UnionFind union = new UnionFind(0);
			HashMap<String, Integer> list = new HashMap<String,Integer>();
			int people = 0;
			for(int y=0; y<num;y++)
			{
				String a = in.next();
				String b = in.next();
				int list1 = 0, list2=0;
				if(!list.containsKey(a))
				{
					union.addOneMore();
					list.put(a, people);
					list1=people;
					people++;
				}
				else
					list1=list.get(a);
				if(!list.containsKey(b))
				{
					union.addOneMore();
					list.put(b,people);
					list2=people;
					people++;
				}
				else
					list2 = list.get(b);
				union.union(list1, list2);
				int setNumber = union.numOfSet(list1);
				System.out.println(setNumber);
			}
		}
	}
	public static class UnionFind{
		private ArrayList<Integer> p, rank, setSize;
		int numSets;
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
				setSize.add(1);
			}
		}
		public void addOneMore()
		{
			p.add(p.size());
			rank.add(0);
			setSize.add(1);
			numSets++;
		}
		public int numOfSet(int x)
		{
			return setSize.get(findSet(x));
		}
		
		public int findSet(int x)
		{
			if(p.get(x)==x)return x;
			else
			{
				int ret = findSet(p.get(x));
				p.set(x,ret);
				return ret;
			}
		}
		public boolean isSameSet(int x, int y)
		{
			return (findSet(x)==findSet(y));
		}
		public void union(int x, int y)
		{
			if(!isSameSet(x,y))
			{
				numSets--;
				int t = findSet(x), g = findSet(y);
				if(rank.get(t)>rank.get(g))
				{
					p.set(g,t);
					setSize.set(t, setSize.get(g)+setSize.get(t));
				}
				else{
					p.set(t, g);
					setSize.set(g, setSize.get(g)+setSize.get(t));
					if(rank.get(g)==rank.get(t))
						rank.set(g,rank.get(g)+1);
				}
			}
			
		}
	}
}
