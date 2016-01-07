package codeforces;

import java.util.Scanner;

public class WayTooLongWords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int x=0; x<times;x++)
		{
			String word = in.next();
			if(word.length()>10)
			{
				String temp = word.substring(0,1);
				temp += Integer.toString(word.length()-2);
				temp+=word.substring(word.length()-1,word.length());
				System.out.println(temp);
			}
			else
				System.out.println(word);
		}
	}

}
