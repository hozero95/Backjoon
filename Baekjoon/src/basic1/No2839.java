package basic1;

import java.util.Scanner;

public class No2839 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, result;
		
		// 입력
		n = scan.nextInt();
		
		// 알고리즘, 출력
		result = 0;
		while(n % 5 != 0 && n >= 0) {
			n -= 3;
			result++;
		}
		if(n < 0) {
			System.out.println(-1);
		}
		else {
			result += n / 5;
			System.out.println(result);
		}
		
		scan.close();
	}
}
