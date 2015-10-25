package uvaProblems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uva1280 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count =1;
		DecimalFormat form = new DecimalFormat();
		form.setMaximumFractionDigits(2);
		form.setMinimumFractionDigits(2);
		while(in.hasNext())
		{
			int poly = in.nextInt();
			double[] tap = new double[50], coef = new double[50];
			for(int x=0; x<=poly;x++)
				tap[x]=Double.parseDouble(in.next());
			
			for(int x=0; x<=poly;x++)
				for(int y=0; y<=poly;y++)
					coef[x+y]+=tap[x]*tap[y];
			double start = Double.parseDouble(in.next()), end =Double.parseDouble(in.next());
			int marks = in.nextInt();
			double integral = volume(end,start,coef);
			
			String temp = form.format(integral);
			temp = temp.replace(",", "");
			System.out.println("Case "+count+": "+temp);
			if(marks>integral)
				System.out.println("insufficient volume");
			else
			{
				int cmark = marks;
				String res = "";
				for(int x=0; x<8;x++)
				{
					if(cmark > integral+0.0001)break;
					double ini = start, fim = end, mid=0,pot=0; 
					while(Math.abs(pot-cmark)>0.001)
					{
						mid = (ini+fim)/2;
						pot = volume( mid, start,coef);
						if(  pot> cmark )  fim = mid;
						else ini = mid;
					}
					String thismark = form.format(mid-start);
					thismark = thismark.replace(",", "");
					if(x ==0)res = thismark;
					else res += " " + thismark;
					cmark+=marks;
				}
				System.out.println(res);
			}
			count++;
		}
	}
	static double volume(double end, double start, double[] coef)
	{
		return Math.abs(Math.PI*(integral(end,coef)-integral(start,coef)));
	}
	static double integral(double val,double[] coef)
	{
		double integral = 0;
		for(int x=0; x<coef.length;x++)
		{
			integral += coef[x]*Math.pow(val, x+1)/(double)(x+1);
		}
		return integral;
	}

}
