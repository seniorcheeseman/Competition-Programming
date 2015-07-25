package uvaProblems;

import java.util.Scanner;

public class Uva344 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] parts = new int[5];
		while(true)
		{
			parts = new int[5];
			int next = input.nextInt();
			if(next==0)break;
			String result = Integer.toString(next) + ": ";
			for(int x=1; x<=next;x++)
			{
				int ones = x%10;
				if(ones==4){
					parts[0]++;
					parts[1]++;
				}
				else if(ones==9)
				{
					parts[0]++;
					parts[2]++;
				}
				else if(ones>=5)
				{
					parts[0]+=ones-5;
					parts[1]++;
				}
				else parts[0]+=ones;
				int tens = (x/10)%10;
				if(tens ==4)
				{
					parts[2]++;
					parts[3]++;
				}
				else if(tens==9)
				{
					parts[2]++;
					parts[4]++;
				}
				else if(tens>=5)
				{
					parts[2]+=tens-5;
					parts[3]++;
				}
				else parts[2]+=tens;
				int hundreds = (x/100%10);
				parts[4]+=hundreds;
			}
			result += parts[0] + " i, " + parts[1]+ " v, "+ parts[2]+ " x, " + parts[3] + " l, "+ parts[4] + " c";
			System.out.println(result);
		}
	}

}
