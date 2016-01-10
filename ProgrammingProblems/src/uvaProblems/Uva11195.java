package uvaProblems;

import java.util.Scanner;

public class Uva11195 {
	public static boolean[][] badSquare;
	public static int size;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		while(true)
		{
			size = in.nextInt();
			if(size==0)break;
			int mask = (1 <<size) -1;
			badSquare = new boolean[16][1<<15];
			for(int x=0;x<size;x++)
			{
				String temp = in.next();
				for(int y=0;y<size;y++)
					if(temp.charAt(y)=='*')
						badSquare[x][1<<y]=true;
			}
			count++;
			System.out.println("Case " +count +": "+backtrack(mask,0,0,0,0));
		}
	}
	public static int backtrack(int mask,int col, int up, int down, int depth)
	{
		if(mask ==col)
			return 1;
		int pos = mask &~ (col | up | down);
		int tot = 0;
		while(pos >0) {
            int p = pos & (-pos);
            pos = pos - p;
            if(!badSquare[depth][p]) {
                tot += backtrack(mask, (col+p), (up+p) << 1, (down+p) >>1, depth+1);
            }
        }
		return tot;
	}
}
