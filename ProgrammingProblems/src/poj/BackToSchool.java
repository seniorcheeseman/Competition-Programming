package poj;
import java.util.Scanner;


public class BackToSchool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(true)
		{
			int times = input.nextInt();
			if(times ==0)break;
			int quickest = 16201;
			for(int x=0;x<times;x++)
			{
				int speed = input.nextInt(),time = input.nextInt();
				if(time>=0)
				{
					double quick =(double) 16200/speed;
					quick +=time;
					if(quickest>quick)
					{
						quickest = (int)Math.ceil(quick);
					}
				}
			}
			System.out.println(quickest);	
		}
	}

}
