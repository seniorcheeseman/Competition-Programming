package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Uva727 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String first = input.readLine();
		int times = Integer.parseInt(first);
		input.readLine();
		boolean f = false;
		for(int x=0; x<times;x++)
		{
			
			String e = "";
			String g;
			while ((g =input.readLine()) != null && !g.isEmpty()) {
				e += g;
			}
			char[] expc = e.toCharArray();
			String result = toPostFix(expc);
			if(f)System.out.println();
			else f= true;
			System.out.println(result);
		}
	}
	public static String toPostFix(char[] expc)
	{
		Stack<Character> operators = new Stack<Character>();
		String result = "";
		for(char a: expc)
		{
			if(isOperand(a))
			{
				char temp = a;
				if(temp==')')
				{
					while(!operators.isEmpty())
					{
						if(operators.peek()=='(')
							{
							operators.pop();
							break;
							
							}
						result += operators.pop();
					}
				}
				else if(temp == '(')
				{
					operators.push(temp);
				}
				else
				{
					while (!operators.isEmpty())
                    {
                        Character op = operators.peek();
                        if ((a == '+' || a == '-') && (op == '+' || op == '-')) {
							result += operators.pop();
						} else if (op == '*' || op == '/') {
							result += operators.pop();
						} else
							break;
                    }
					operators.add(temp);
				}
			}
			else result +=a;
		}
		while(!operators.isEmpty())
		{
			result+=operators.pop();
		}
		return result;
	}
	public static boolean isOperand(char c)
	{
		return (c=='('||c==')'||c=='*'||c=='+'||c=='-'||c=='/');
	}

}
