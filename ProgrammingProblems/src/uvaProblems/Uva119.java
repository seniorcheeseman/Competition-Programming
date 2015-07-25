package uvaProblems;


import java.util.Scanner;

public class Uva119 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int first =0; 
		while(input.hasNext())
		{
			if(first==0)first++;
			else System.out.println();
			int names = input.nextInt();
			String[] people = new String[names];
			int[] worth = new int[names];
			for(int x=0; x<names;x++)
			{
				people[x] = input.next();
			}
			for(int x=0; x<names;x++)
			{
				String giver = input.next();
				int given = input.nextInt();
				int lovers = input.nextInt();
				int diff = (lovers!=0)?given-given%lovers:0;
				worth[findPerson(giver,people)] -= diff;
				for(int g=0; g<lovers;g++)
				{
					String receiver = input.next();
					worth[findPerson(receiver,people)] +=given/lovers;
				}
			}
			for(int x=0; x<names;x++)
			{
				System.out.println(people[x] + " " +worth[x]);
			}
		}
	}
	
	public static int findPerson(String name, String[] list)
	{
		for(int x=0; x<list.length;x++)
		{
			if(list[x].equals(name))return x;
		}
		return -1;
	}

}
