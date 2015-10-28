package poj;
import java.util.Scanner;


public class DnaSorting {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String line1 = in.nextLine();
		String[] input = line1.split(" ");
		int size = Integer.parseInt(input[1]);
		String[] list = new String[size];
		int[] points = new int[size];
		for(int x =0; x<size;x++)
		{
			String temp = in.next();
			int point = score(temp);
			list[x]=temp;
			points[x]= point;
		}
		
		for(int x = 0; x<list.length;x++)
		{
			int g = findMin(x,points);
			swap(points,list, x, g);
		}
		for(int x = 0; x<list.length;x++)
		System.out.println(list[x]);
	}
	public static int findMin(int x,int[] stuff)
	{
		if(x>=stuff.length)return -1;
		int lowest = x;
		for(int y = x;y<stuff.length;y++)
		{
			if(stuff[y]<stuff[lowest])lowest = y;
		}
		return lowest;
	}
	public static void swap(int[] scores, String[] b, int x, int y)
	{
		if(x<0||y<0||x>b.length||y>b.length)return;
		int temp = scores[x];
		scores[x] = scores[y];
		scores[y] = temp;
		String gg = b[x];
		b[x] = b[y];
		b[y] = gg;
	}
	public static int score(String shit)
	{
		int score = 0;
		char[] temp =shit.toCharArray();
		for(int x = 0; x<temp.length;x++)
		{
			for(int y=x+1;y<temp.length;y++){
				if(temp[x]>temp[y])score++;
			}
		}
		return score;
	}
}
