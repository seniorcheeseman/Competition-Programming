package poj;
import java.util.Scanner;
import java.util.Stack;
public class webNavigation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Stack<String> back = new Stack<String> ();
		Stack<String>  forward = new Stack<String> ();
		String current = "http://www.acm.org/";
		while(true)
		{
			String next = in.next();
			if(next.equals("QUIT"))break;
			
			if(next.equals("VISIT"))
			{
				String temp = in.next();
				if(!current.equals("")){
					back.add(current);
					current = temp;
				}
				else current = temp;
				forward= new Stack<String>();
				System.out.println(current);
			}
			else if(next.equals("BACK")){
				if(!back.isEmpty())
				{
				 forward.add(current);
				 current =(String) back.pop();
				 System.out.println(current);
				}
				else System.out.println("Ignored");
			}
			else if(next.equals("FORWARD"))
			{
				if(!forward.isEmpty())
				{
					back.add(current);
					current = (String) forward.pop();
					System.out.println(current);
				}
				else System.out.println("Ignored");
			}
		}
	}

}
