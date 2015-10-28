package poj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class SudokuSolver {
	private static int[][] board;
	private static int[] rows;
	private static int[] columns;
	private static int[][] cells;
	private static int[] array;
	private static ArrayList<Pair> points;
	public static class Pair{
		public int x,y;
		public Pair(int xx, int yy){
			x=xx;y=yy;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		array = new int[512];
		for(int x=0; x<512;x++)
		{
			array[x]= array[x/2]+ x%2;			
		}
		while(true)
		{
			String next = input.readLine();
			if(next.equals("end"))break;
			board = new int[9][9];
			rows = new int[9];
			columns = new int[9];
			cells = new int[3][3];
			points = new ArrayList<Pair>();
			int x=0;
			int y=0;
			for(int z=0; z<next.length();z++)
			{
				char temp = next.charAt(z);
				if(temp == '.')
				{
					board[x][y]= 0;
					points.add(new Pair(x,y));
				}
				else
				{
					int in = Character.getNumericValue(temp);
					board[x][y]=in;
					rows[x]^= 1<<in-1;
					columns[y]^= 1<<in-1;
					cells[x/3][y/3]^=1<<in-1;
				}
				if(x+1!=9)
					x++;
				else{
					x=0;
					y++;
				}
			}
			solve();
		}
	}

	public static boolean solve()
	{
		int x = -1, y=-1, mini_ones = 12;
		Pair gg = new Pair(-1,-1);
		for(int g =0; g<points.size();g++)
		{
			Pair bb = points.get(g);
			int gx = bb.x;
			int gy = bb.y;
				if(board[gx][gy]==0)
				{
					int temp = 511 - (rows[gx]|columns[gy]|cells[gx/3][gy/3]);
					int ones = array[temp];
					if(ones==0)return false;
					if(ones<mini_ones)
					{
						mini_ones = ones;
						x = gx;
						y = gy;
						gg = bb;
					}
				}
		}
		if(mini_ones==12){boardToString(board);return true;}
		for(int g=0;g<9;g++)
		{
			if(((columns[y]>>g&1)!=1)&&((rows[x]>>g& 1)!=1)&&((cells[x/3][y/3]>>g& 1)!=1))
			{
				board[x][y]= g+1;
				points.remove(gg);
				rows[x]^= 1<<g;
				columns[y]^= 1<<g;
				cells[x/3][y/3]^=1<<g;
				if(solve())return true;
				board[x][y]= 0;
				points.add(gg);
				rows[x]^= 1<<g;
				columns[y]^= 1<<g;
				cells[x/3][y/3]^=1<<g;
			}
		}
		return false;
	}
	public static void boardToString(int[][]board)
	{
		for(int y=0;y<9;y++)
		{
			for(int x=0; x<9;x++)
			{
				System.out.print(board[x][y]);
			}
		}
		System.out.println();
	}
}
