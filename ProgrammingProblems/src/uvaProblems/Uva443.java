package uvaProblems;

import java.util.Scanner;

public class Uva443 {
	private static long[] humbled;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		nextHumble();
		while(true)
		{
			int next = input.nextInt();
			if(next==0)break;
			
			long result=humbled[next-1];
			System.out.println("The "+getRank(next)+" humble number is "+result+".");
		}
	}
	
	public static String getRank(int next)
	{
		int huns = next%100;
		int ones = huns%10;
		String res = Integer.toString(next);
		if(huns>9&&huns<20)
			res+= "th";
		else
		{
			if(ones==1)res+="st";
			else if(ones==2) res +="nd";
			else if(ones==3) res+= "rd";
			else res+="th";
		}
		return res;
	}
	
	public static void nextHumble(){
		int[] deg = new int[5];
        int[] num = {2, 3, 5, 7};
        humbled = new long[5842];
        long cur;
        for(int x=0; x<deg.length;x++)deg[x] = 0;
        for(int x=0; x<humbled.length;x++)humbled[x]=1;
        for (int i=1 ; i<5842 ; i++) {
            cur=Long.MAX_VALUE;
            for (int j=0 ; j<4 ; j++) {
                if (cur>humbled[deg[j]]*num[j])
                    cur=humbled[deg[j]]*num[j];
            }
            humbled[i]=cur;
            for (int j=0 ; j<4 ; j++) {
                if (cur == (humbled[deg[j]]*num[j]))
                    deg[j]++;
            }
        }
	}
}
