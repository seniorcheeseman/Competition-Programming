package codeforces;

import java.util.Scanner;

public class DominoPiling {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int res = (int)Math.floor(n*m*0.5);
		System.out.println(res);
	}

}
