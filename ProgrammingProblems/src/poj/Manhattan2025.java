package poj;
import java.util.Scanner;


public class Manhattan2025 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int time = input.nextInt();
		for(int x=0; x<time;x++)
		{
			int next = input.nextInt();
			if(next ==0)
			{
				System.out.println("Scenario #"+(x+1)+":\nslice #1:\n0");
			}
			else
			{
				int times = next*2+1;
				String[][] flood = new String[times][times];
				for(int y = 0; y<times;y++)
				{
					for(int z=0; z<times;z++)
					{
						flood[y][z] = ".";
					}
				}
				flood[next][next] = Integer.toString(next);
				String[] lists = new String[next+1];
				lists[0]= floodToString(flood);
				System.out.println("Scenario #" +(x+1)+":");
				System.out.println("slice #1:");
				System.out.println(lists[0]);
				int g=1;
				for(;g<=next;g++)
				{
					System.out.println("slice #"+(g+1)+":");
					if(g<=next){
						lists[g] = flood(flood);
					}
					System.out.println(lists[g]);
				}
				for(;g<times;g++)
				{
					System.out.println("slice #"+(g+1)+":");
					System.out.println(lists[times-g-1]);
				}
					
			}
			System.out.println();
		}
	}
	public static String floodToString(String[][] place)
	{
		String result = "";
		for(int x=0; x<place.length;x++)
		{
			for(int y=0; y<place.length;y++)
			{
				result += place[x][y];
			}
			if(x!=place.length-1)
			result += "\n";
		}
		return result;
	}
	public static String flood(String[][] place)
	{
		boolean[][] visited = new boolean[place.length][place.length];
		String result = "";
		for(int x=0; x<place.length;x++)
		{
			for(int y=0; y<place.length;y++)
			{
				if(!place[x][y].equals("."))
				{
					if(!visited[x][y])
					{
					if(x-1>=0)
					{
						if(place[x-1][y].equals("."))
						{
							place[x-1][y] = place[x][y];
							visited[x-1][y]=true;
						}
					}
					if(y-1>=0)
					{
						if(place[x][y-1].equals("."))
						{
							place[x][y-1] = place[x][y];
							visited[x][y-1]=true;
						}
					}
					if(x+1<place.length)
					{
						if(place[x+1][y].equals("."))
						{
							place[x+1][y] = place[x][y];
							visited[x+1][y]=true;
						}
					}
					if(y+1<place.length)
					{
						if(place[x][y+1].equals("."))
						{
							place[x][y+1] = place[x][y];
							visited[x][y+1]=true;
						}
					}
					if(!place[x][y].equals("0"))
					place[x][y] =Integer.toString((Integer.parseInt(place[x][y])-1));
					
					visited[x][y]=true;
					}
				}
			}
		}
		result = floodToString(place);
		return result;
	}

}
