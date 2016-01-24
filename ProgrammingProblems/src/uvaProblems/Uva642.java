package uvaProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Uva642 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, ArrayList<String>> list = new HashMap<String, ArrayList<String>>();
		boolean first = false;
		while(in.hasNext())
		{
			String next = in.next();
			if(next.equals("XXXXXX")&&first)break;
			else if(next.equals("XXXXXX"))
			{
				first = true;continue;
			}
			char[] temp = next.toCharArray();
			Arrays.sort(temp);
			String lol = new String(temp);
			if(!first)
			{
				if(list.containsKey(lol))
					list.get(lol).add(next);
				else
				{
					ArrayList<String> v = new ArrayList<String>();
					v.add(next);
					list.put(lol, v);
				}	
			}
			else
			{
				if(list.containsKey(lol))
				{
					ArrayList<String> gg = list.get(lol);
					String[] meh = new String[gg.size()];
					meh = gg.toArray(meh);
					Arrays.sort(meh);
					for(String a:meh)
						System.out.println(a);
				}
				else
				{
					System.out.println("NOT A VALID WORD");
				}
				System.out.println("******");
			}
		}
	}

}
