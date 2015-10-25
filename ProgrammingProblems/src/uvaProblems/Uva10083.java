package uvaProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class Uva10083 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int t = in.nextInt(),a = in.nextInt(),b = in.nextInt();
			String res = "("+Integer.toString(t)+"^"+Integer.toString(a)+"-1)/("+Integer.toString(t)+"^"+Integer.toString(b)+"-1) ";
			if(t==1||a<b||a%b!=0||Math.floor((a - b) * Math.log10(t)) + 1 >= 100)
			{
				res += "is not an integer with less than 100 digits.";
			}
			else if(a==b)res+="1";
			else
			{
				BigInteger ma=((BigInteger.valueOf(t)).pow(a)).subtract(BigInteger.ONE).divide(((BigInteger.valueOf(t)).pow(b)).subtract(BigInteger.ONE));
				res += ma.toString();
			}
			System.out.println(res);
		}
	}

}
