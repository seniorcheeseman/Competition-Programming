package codeforces;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String w = in.next();
		w = w.toLowerCase();
		String res = "";
		for(int x=0; x<w.length();x++)
		{
			char temp = w.charAt(x);
			if(temp!='a'&&temp!='o'&&temp!='y'&&temp!='e'&&temp!='u'&&temp!='i')
				res += "."+w.substring(x,x+1);
		}
		System.out.println(res);
	}

}
