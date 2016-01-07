package codeforces;

import java.util.Scanner;

public class Watermelon {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		System.out.println((w%2==0&&w>=4)?"YES":"NO");
	}

}
