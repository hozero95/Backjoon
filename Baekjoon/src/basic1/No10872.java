package basic1;

import java.util.Scanner;

public class No10872 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int result = 1;
		
		// 입력
		n = scan.nextInt();
		
		// 알고리즘
		for(int i = n; i >= 1; i--) {
			result *= i;
		}
		
		// 출력
		System.out.println(result);
		
		scan.close();
	}
}
