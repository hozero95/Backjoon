package basic1;

import java.util.Scanner;

public class No14720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int[] milk;
		int[][] result;
		
		// 입력
		n = scan.nextInt();
		milk = new int[n];
		result = new int[n][3];
		for(int i = 0; i < milk.length; i++) {
			milk[i] = scan.nextInt();
		}
		
		// 알고리즘
		if(milk[0] == 0) {
			result[0][0] = 1;
		}
		for(int i = 1; i < n; i++) {
			result[i][0] = milk[i] == 0 ? result[i - 1][2] + 1 : result[i - 1][0];
			result[i][1] = milk[i] == 1 && result[i][2] < result[i][0] ? result[i - 1][0] + 1 : result[i - 1][1];
			result[i][2] = milk[i] == 2 && result[i][0] < result[i][1] ? result[i - 1][1] + 1 : result[i - 1][2];
		}
		
		// 출력
		System.out.println(Math.max(result[n - 1][0], Math.max(result[n - 1][1], result[n - 1][2])));
		
		scan.close();
	}
}
