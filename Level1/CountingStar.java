package Level1;

import java.util.Scanner;

public class CountingStar {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();

		for (int b = 0; b < n; b++) {
			for (int a = 0; a < m; a++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
