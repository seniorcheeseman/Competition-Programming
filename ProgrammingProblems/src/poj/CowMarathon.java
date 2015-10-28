package poj;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class CowMarathon {
	private static int[] dist;
	private static ArrayList<Integer>[] edges;
	private static ArrayList<Integer>[] weights;
	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
//		cost= new int[n+1][n+1];
		edges = (ArrayList<Integer>[]) new ArrayList[n+1];
		weights = (ArrayList<Integer>[]) new ArrayList[n+1];
		for(int x=1; x<n+1;x++)
		{
			edges[x] = new ArrayList<Integer>();
			weights[x]= new ArrayList<Integer>();
		}
		for(int x=0; x<m;x++)
		{
			int a= input.nextInt();
			int b = input.nextInt();
			int cu = input.nextInt();
			input.next();
//			cost[a][b]=cu;
			edges[a].add(b);
			weights[a].add(cu);
			edges[b].add(a);
			weights[b].add(cu);
//			cost[b][a]=cu;
		}
		int mid = bfs(1,n);
		int end = bfs(mid,n);
		System.out.println(dist[end]);
	}
	
	public static int bfs(int start,int m)
	{
		int farFarm = 0;
		int far = -1;
		dist = new int[m+1];
		boolean[] visited = new boolean[m+1];
		ArrayDeque<Integer> monster = new ArrayDeque<Integer>();
		monster.add(start);
		while(!monster.isEmpty())
		{
			int cur = monster.pop();
			if(!visited[cur])
			{
				for(int x=0; x<edges[cur].size();x++)
				{
					int temp = edges[cur].get(x);
					if(!visited[temp])
					{
						int weight = weights[cur].get(x);
							if(weight>0)
							{
								if(weight+dist[cur]>dist[temp])
							dist[temp]=weight+dist[cur];
							if(dist[temp]>far)
							{
								far = dist[temp];
								farFarm = temp;
							}
							monster.add(temp);
							}
					}
				}
			visited[cur]=true;
			}
		}
		return farFarm;
	}
}
