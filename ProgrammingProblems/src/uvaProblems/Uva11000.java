package uvaProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Uva11000 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<Long> male = new ArrayList<Long>(),female = new ArrayList<Long>();
		male.add(0L);//n=0
		female.add(1L);//n=0
		while(male.get(male.size()-1)<Integer.MAX_VALUE&&female.get(female.size()-1)<Integer.MAX_VALUE)
		{
			long man = male.get(male.size()-1)+female.get(female.size()-1);
			long fem = male.get(male.size()-1)+1;
			male.add(man);
			female.add(fem);
		}
		while(true)
		{
			int years = in.nextInt();
			if(years==-1)break;
			String res = Long.toString(male.get(years))+ " " + Long.toString(male.get(years)+female.get(years));
			System.out.println(res);
		}
	}

}
