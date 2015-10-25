package uvaProblems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uva10900 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int n = in.nextInt();
			double t = Double.parseDouble(in.next());
			if(n==0&&t==0)break;
			double f = Math.pow(2,n);
			for(int x=n-1;x>=0;x--)
			{
				double two = Math.pow(2, x);
				double eq = two/f;
				if(eq<=t)
				{
					f= (t+1)/2*f;
				}
				else
				{
					f= (eq-t)/(1-t)*two+(1-eq)/(1-t)*((1+eq)/2)*f;
				}
			}
			DecimalFormat form = new DecimalFormat();
			form.setMaximumFractionDigits(3);
			form.setMinimumFractionDigits(3);
			String temp = form.format(f);
			temp = temp.replace(",", "");
			System.out.println(temp);
		}
	}

}
