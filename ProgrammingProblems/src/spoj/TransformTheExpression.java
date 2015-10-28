package spoj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TransformTheExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String gg = input.nextLine();
		int times = Integer.parseInt(gg);
		for(int x=0; x<times;x++)
		{
			String ex = input.nextLine();
			Stack<Character> parentheses = new Stack<Character>();
			Queue<Character> variables = new LinkedList<Character>();
			parentheses.push(ex.charAt(0));
			for(int y=1; y<ex.length();y++)
			{
				char temp = ex.charAt(y);
				if(temp == '(')
				{
					parentheses.push(temp);
				}
				else if(temp == ')')
				{
					parentheses.pop();
					int count =0; 
					while(count!=2||variables.isEmpty())
					{
						
					}
				}
			}
		}
		
	}
	class Expression{
		String a, b, op;
		public Expression(String A, String B, String operation)
		{
			a=A;
			b=B;
			op = operation;
		}
		public String getOperation()
		{
			return a+b+op;
		}
	}

}
