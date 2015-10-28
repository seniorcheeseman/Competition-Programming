package spoj;

import java.util.Arrays;
import java.util.Scanner;

public class fashionShows {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int times = input.nextInt();
			for(int x=0; x<times;x++)
			{
				int pairs = input.nextInt();
				int[] men = new int[pairs];
				int[] women = new int[pairs];
				for(int y=0; y<pairs;y++)
				men[y] = input.nextInt();
				for(int y=0;y<pairs;y++)
				women[y] = input.nextInt();
				Arrays.sort(men);
				Arrays.sort(women);
				int total =0;
				for(int y=0; y<pairs;y++)
				{
					total+= men[y]*women[y];
				}
				System.out.println(total);
			}
	}
}
