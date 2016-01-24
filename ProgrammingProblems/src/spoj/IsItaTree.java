package spoj;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class IsItaTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		ArrayList<ArrayList<Integer>> nodes =new ArrayList<ArrayList<Integer>>();
		for(int x=0; x<n;x++)
			nodes.add(new ArrayList<Integer>());
		for(int x=0; x<m;x++)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			if(!nodes.get(a-1).contains(b))
			nodes.get(a-1).add(b);
		}
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(1);
		boolean[] visited = new boolean[n+1];
		boolean isTree = true;
		int visitedCount = 0;
		while(!queue.isEmpty())
		{
			int next = queue.remove();
			if(visited[next])
			{
				isTree = false;
				break;
			}
			visited[next] =true;
			visitedCount++;
			for(int gg:nodes.get(next-1))
				queue.add(gg);
		}
		if(visitedCount!=n)
			isTree=false;
		System.out.println((isTree)?"YES":"NO");
	}
}