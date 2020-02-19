package basic1;

import java.util.Scanner;

public class No1065 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, result;

		// 입력
		n = scan.nextInt();

		// 알고리즘
		if (n >= 100) {
			result = 99;
			for (int i = 100; i <= n; i++) {
				int n1 = i / 100;
				int n2 = i / 10 % 10;
				int n3 = i % 10;
				if(n2 * 2 == n1 + n3) {
					result++;
				}
			}
		} else {
			result = n;
		}
		
		// 출력
		System.out.println(result);
		
		scan.close();
	}
}
