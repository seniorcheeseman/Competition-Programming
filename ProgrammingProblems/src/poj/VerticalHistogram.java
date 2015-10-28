package poj;
import java.util.Scanner;


public class VerticalHistogram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String list = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] letters = new int[26];
		int max = 0;
		for(int x=0; x<4;x++)
		{
			String a = input.nextLine();
			for(int y=0; y<a.length();y++)
			{
				int index = list.indexOf(a.charAt(y));
				if(index>=0)
				{
					letters[index]++;
					if(letters[index]>max){
						max = letters[index];
					}
				}
			}
		}
		String print = "";
		for(int x=max; x>0;x--){
			print = "";
			boolean first = false;
			int last = 0;
			for(int y=0; y<26;y++)
			{
				if(letters[y]>=x)
				{
					if(y==0)first = true;
					int t = y-last;
					for(int g=0; g<((t!=1)?t*2-1:t);g++)
					{
						print+=" ";
					}
					last = y;
					print +="*";
				}
			}
			System.out.println((first)?print:" " + print);
		}
		System.out.println("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
	}

}
