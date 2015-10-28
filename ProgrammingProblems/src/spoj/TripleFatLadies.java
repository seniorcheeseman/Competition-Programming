package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class TripleFatLadies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//		for(int x=0; x<=2000;x++)
//		{
//			double temp = Math.pow(x, 3);
//			if((temp-888)%1000==0)System.out.println(x);
//		}
		String cases = input.nextLine();
		int times = Integer.parseInt(cases);
		for(int x=0; x<times;x++)
		{
			BigInteger gg = new BigInteger(input.nextLine());
			BigInteger mod = gg.mod(BigInteger.valueOf(4));
			int cur = mod.intValue();
			mod = gg.divide(BigInteger.valueOf(4));
			mod.subtract(BigInteger.valueOf(1));
			String result ="";
			if(cur==1)result="192";
			else if(cur==2)result ="442";
			else if(cur==3)result ="692";
			else if(cur==0)
				{result ="942";
				mod =  mod.subtract(BigInteger.valueOf(1));
				}
			if(mod.compareTo(new BigInteger("9223372036854775"))>=0)
				result = "9223372036854775"+result;
			else if(!mod.toString().equals("0"))
			result = mod.toString()+result;
			System.out.println(result);
		}
	}
	

}
