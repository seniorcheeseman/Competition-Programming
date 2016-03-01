package uvaProblems;

import java.util.Scanner;

public class Uva10405 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String a = in.nextLine();
			String b= in.nextLine();
			int n = a.length();
			int m = b.length();
			int[][] used = new int[n+1][m+1];
			b= " "+b;
			a = " "+a;
			char[] aa = a.toCharArray();
			char[] ba = b.toCharArray();
			for(int x=1;x<=n;x++)
			{
				for(int y=1;y<=m;y++)
				{
					if(aa[x]==ba[y])
						used[x][y]=used[x-1][y-1]+1;
					else
						used[x][y]=Math.max(used[x-1][y], used[x][y-1]);
				}
			}
			int res = used[n][m];
			System.out.println(res);
		}

	}

}
