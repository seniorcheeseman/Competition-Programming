package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class ArmyStrength {
	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(in.readLine());
		in.readLine();
		for(int x=0; x<times;x++)
		{
			in.readLine();
			StringTokenizer token = new StringTokenizer(in.readLine());
			int maxg = 0,maxm=0;
			while(token.hasMoreTokens())
			{
				int temp = Integer.parseInt(token.nextToken());
				if(temp>maxg)maxg=temp;
			}
			token = new StringTokenizer(in.readLine());
			while(token.hasMoreTokens())
			{
				int temp = Integer.parseInt(token.nextToken());
				if(temp>maxm)maxm=temp;
			}
			if(maxg>=maxm)
				System.out.println("Godzilla");
			else if(maxm>maxg)
				System.out.println("MechaGodzilla");
			else
				System.out.println("uncertain");
			if(x!=times-1)
			in.readLine();
		}
	}

}
