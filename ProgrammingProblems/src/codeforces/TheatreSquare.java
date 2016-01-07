package codeforces;

import java.util.Scanner;

public class TheatreSquare {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n = in.nextInt();
		double m = in.nextInt();
		double a = in.nextInt();
		long num = (long) (Math.ceil(m/a)*Math.ceil(n/a));
		System.out.println(num);
	}
}