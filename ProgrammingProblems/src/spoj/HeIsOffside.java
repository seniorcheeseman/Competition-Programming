package spoj;

import java.util.Scanner;

public class HeIsOffside {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int a = in.nextInt();
			int d = in.nextInt();
			if(a==0&&d==0)break;
			int[] att = new int[a],def = new int[d];
			for(int x=0; x<a;x++)
			{
				att[x]=in.nextInt();
			}
			int sl =Integer.MAX_VALUE, l = Integer.MAX_VALUE;
			for(int y=0; y<d;y++)
			{
				def[y]=in.nextInt();
				if(def[y]==l)
					sl = def[y];
				else if(def[y]<l)
				{
					sl = l;
					l = def[y];
				}
				else if(def[y]<sl)
					sl = def[y];
			}
			boolean offside = false;
			for(int x=0; x<a;x++)
			{
				if(att[x]<sl)
				{
					offside = true;
					break;
				}
			}
			if(offside)System.out.println("Y");
			else System.out.println("N");
		}
	}

}
