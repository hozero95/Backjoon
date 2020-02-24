package basic1;

import java.util.Scanner;

public class No1149 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 입력
		int n = scan.nextInt();
		int[][] rgb = new int[n][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				rgb[i][j] = scan.nextInt();
			}
		}

		// 알고리즘
		for (int i = 1; i < n; i++) {
			rgb[i][0] += Math.min(rgb[i - 1][1], rgb[i - 1][2]);
			rgb[i][1] += Math.min(rgb[i - 1][0], rgb[i - 1][2]);
			rgb[i][2] += Math.min(rgb[i - 1][0], rgb[i - 1][1]);
		}

		// 출력
		System.out.println(Math.min(rgb[n - 1][0], Math.min(rgb[n - 1][1], rgb[n - 1][2])));

		scan.close();
	}
}
