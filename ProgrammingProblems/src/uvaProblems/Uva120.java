package uvaProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Uva120 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			String next = input.nextLine();
			String[] list = next.split(" ");
			int[] temp = new int[list.length];
			int[] reverse = new int[list.length];
			for(int x=0; x<list.length;x++)
			{
				temp[x] = Integer.parseInt(list[x]);
				reverse[x] = temp[x];
			}
			Arrays.sort(reverse);
			ArrayList<Integer> flips = new ArrayList<Integer>();
			for(int x=list.length-1; x>0;x--)
			{
				int index = 0;
				for(int y=0;y<=x;y++)
				{
					index = (temp[y]>temp[index])?y:index;
				}
				if(index==x) continue;
				reverse(temp,index);
				if(index!=0)
				flips.add(list.length-1-index);
				reverse(temp,x);
				flips.add(list.length-1-x);
			}
			System.out.println(next);
			for (int flip : flips)     
				System.out.print((flip+1) +" ");
			 
            System.out.println(0);
		}
	}
	
	public static int[] flip(int[] in, int point)
	{
		int[] res = new int[in.length];
		int temp =point;
		for(int x=0;x<=temp;x++)
		{
			res[temp-x]=in[x];
		}
		for(int x=temp+1;x<in.length;x++)
		{
			res[x]=in[x];
		}
		return res;
	}
	public static void reverse(int[] a, int end){
        for(int i=0, j=end ; i<j; a[i]=a[i]^a[j], a[j]=a[i]^a[j], a[i]=a[i++]^a[j--]);
    }
}
