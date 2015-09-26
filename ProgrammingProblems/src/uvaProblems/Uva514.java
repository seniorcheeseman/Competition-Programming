package uvaProblems;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Uva514 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int number = Integer.parseInt(in.nextLine());
			if(number ==0)break;
			while(true)
			{
				boolean truth = true;
				boolean br = false;
				Stack<Integer> st = new Stack<Integer>();
				String line = in.nextLine();
				StringTokenizer token = new StringTokenizer(line);
				int pointer = 1;
				for(int x=0;x<number&&truth;x++)
				{
					int g = Integer.parseInt(token.nextToken());
					if(g==0){
						br =true;
						break;
					}
					while(g>=pointer)
					{
						st.add(pointer);
						pointer++;
					}
					if(g==st.peek())
						st.pop();
					else truth=false;
				}
				if(br)break;
				System.out.println((truth)?"Yes":"No");
			}
			System.out.println();
		}
	}

}
