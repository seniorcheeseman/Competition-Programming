package uvaProblems;

import java.util.Scanner;

public class Uva332 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int times = 1;
		while(true)
		{
			String testCase = input.nextLine();
			if(testCase.equals("-1"))break;
			int j = Integer.parseInt(testCase.substring(0,1));
			testCase = testCase.substring(1);
			testCase=testCase.replaceAll(" ", "");
			String[] parts = testCase.split("\\.");
			double dec = Double.parseDouble(testCase);
			
			int k = parts[1].length()-j;
			int powk=1;
			int powj=1;
			for(int x=0; x<k;x++)
				powk*=10;
			for(int x=0; x<j;x++)
				powj*=10;
			int powkj = powk*powj;
			int gg =(int) Math.round(dec* powkj);
			int num = 0;
			int den = 0;
			
			if (powkj == powk) {
				num = gg;
				den = powkj;
			} else {
				num = gg - gg / powj;
				den = powkj - powk;
			}
			int res = gcd(num,den);
			if(res!=0)
			{
				num/=res;
				den/=res;
			}
			System.out.println("Case "+ times+": "+num+"/"+den);
			times++;
		}
	}
	public static int gcd(int a, int b)
	{
		return (b==0)?a:gcd(b,a%b);
	}

}
