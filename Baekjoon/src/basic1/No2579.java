package basic1;

import java.util.Scanner;

public class No2579 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int[] stairs, dp;

		// 입력
		num = scan.nextInt();
		stairs = new int[num + 1];
		dp = new int[num + 1];
		for (int i = 1; i <= num; i++) {
			stairs[i] = scan.nextInt();
		}

		// 알고리즘
		dp[1] = stairs[1];
		if(num >= 2) {
			dp[2] = dp[1] + stairs[2];	
		}
		for (int i = 3; i <= num; i++) {
			dp[i] = Math.max(dp[i - 2] + stairs[i], dp[i - 3] + stairs[i - 1] + stairs[i]);
		}

		// 출력
		System.out.println(dp[num]);

		scan.close();
	}
}
