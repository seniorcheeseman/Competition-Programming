package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AntiBlotSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws java.lang.Exception
     {
		// TODO Auto-generated method stub
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		int times= Integer.parseInt(input.readLine());
		for(int x=0; x<times;x++)
		{
			@SuppressWarnings("unused")
			String buffer = input.readLine();
			String process = input.readLine();
			String[] parts = process.split(" ");
			int a =0;
			int b =0;
			int c =0;
			if(parts[0].indexOf("m")>=0)
			{
			 b = Integer.parseInt(parts[2]);
			 c = Integer.parseInt(parts[4]);
			 a = c-b;
			}
			else if(parts[2].indexOf("m")>=0)
				{
				 a = Integer.parseInt(parts[0]);
				 c = Integer.parseInt(parts[4]);
				 b = c-a;
				}
			else if(parts[4].indexOf("m")>=0)
				{
				 a = Integer.parseInt(parts[0]);
				 b = Integer.parseInt(parts[2]);
				 c = b+a;
				}
			System.out.println(a + " + "+ b+ " = "+ c);
		}
	}

}
