package uvaProblems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uva378 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unused = 0;
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		DecimalFormat form = new DecimalFormat();
		form.setMaximumFractionDigits(2);
		form.setMinimumFractionDigits(2);
		System.out.println("INTERSECTING LINES OUTPUT");
		for(int x=0; x<times;x++)
		{
			double x1 = in.nextInt(),y1 = in.nextInt(), x2 = in.nextInt(),y2 = in.nextInt(), x3 = in.nextInt(), y3 = in.nextInt(), x4 = in.nextInt(),y4 = in.nextInt();
			double slope1 = (y2-y1)/(x2-x1),slope2 = (y4-y3)/(x4-x3);
			double ptx,pty;
			 if(x1==x2 || x3==x4){
                 if(x1==x2){
                    ptx=x1;
                    pty=slope2*(x1-x3)+y3;
                 }
                 else{
                  ptx=x3;
                  pty=slope1*(x3-x1)+y1;
                 }
              System.out.println("POINT "+ form.format(ptx)+ " "+form.format(pty));    
	       }
	       else if(y1==y2 || y3==y4){
                 if(y1==y2){
                    pty=y1;
                    ptx=(y1-y3)/slope2 + x3;
                 }
                 else{
	                pty=y3;
	                ptx=(y3-y1)/slope1 + x1;
                 }
	          System.out.println("POINT "+ form.format(ptx)+ " "+form.format(pty));  
	       }
			else if(slope1==slope2)
			{
				double slope3 = (y3-y1)/(x3-x1), slope4 = (y4-y2)/(x4-x2);
				if(slope3==slope4)
					System.out.println("LINE");
				else
					System.out.println("NONE");
			}
			else
			{
				ptx=(y3-y1+slope1*x1-slope2*x3)/(slope1-slope2);
                pty=(slope1*(y3-slope2*x3)-slope2*(y1-slope1*x1))/(slope1-slope2);
                System.out.println("POINT "+ form.format(ptx)+ " "+form.format(pty));
			}
		}
		System.out.println("END OF OUTPUT");
	}

}
