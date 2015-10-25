package uvaProblems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uva10341 {
	public static int p,q,r,s,t,u;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			p = in.nextInt();
			q = in.nextInt();
			r = in.nextInt();
			s = in.nextInt();
			t = in.nextInt();
			u = in.nextInt();
			if(function(0)*function(1)>0)System.out.println("No solution");
			else
			{
				double lo = 0, hi = 1,x= (lo+hi)/2;;
				while(hi-lo>0.00000000001f)
				{
					 x = (lo+hi)/2;
					double tempHi = function(x);
					if(tempHi<0)
					{
						hi = x;
					}else
					{
						lo = x;
					}
				}
				DecimalFormat form = new DecimalFormat();
				form.setMaximumFractionDigits(4);
				form.setMinimumFractionDigits(4);
				System.out.println(form.format((lo+hi)/2));
			}
		}
	}
	public static double function(double x)
	{
		return  p*Math.exp(-x) + q*Math.sin(x) + r*Math.cos(x) + s*Math.tan(x) + t*x*x + u;
	}
}
