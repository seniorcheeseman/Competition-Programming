package poj;
import java.util.Scanner;


public class AddingReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		for(int x=0; x<times;x++)
		{
			long a = input.nextLong();
			String at = reverse(a);
//			System.out.println(at);
			long b = input.nextLong();
			String bt = reverse(b);
			long res = Long.parseLong(at)+Long.parseLong(bt);
			System.out.println(reverse(res));
		}
	}
	
	public static String reverse(long a)
	{
		String temp = Long.toString(a);
		String result = "";
		boolean stop = true;
		for(int x=0; x<temp.length();x++)
		{
			if(temp.charAt(temp.length()-1-x)== '0'&& stop)
			{
			}
			else
				{
				stop = false;
				result +=temp.charAt(temp.length()-1-x);
				}
		}
		return result;
	}

}
