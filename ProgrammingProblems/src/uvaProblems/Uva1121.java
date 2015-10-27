package uvaProblems;

import java.util.Scanner;

public class Uva1121 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			long n = input.nextLong();
			long s = input.nextLong();
			long[] nums = new long[(int)n];
			int minimum = Integer.MAX_VALUE;
			int hi = 0,low = 0;
			for(long x=0; x<n;x++)
			{
				nums[(int)x] = input.nextLong();
			}
			long sum = nums[0];
			while (hi < n) {
				if (sum >= s) {
					int temp = hi - low + 1;
					if (temp < minimum)
						minimum = temp;
				}
				if (sum >= s && low < hi) {
					sum -= nums[low];
					low++;
				} else if (sum < s) {
					hi++;
					if (hi < n)
						sum += nums[hi];
				}
			}
			if(minimum==Integer.MAX_VALUE)minimum =0;
			System.out.println(minimum);
		}
	}

}
