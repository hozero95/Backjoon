package basic1;

import java.util.Scanner;

public class No2748 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		long[] fibonacci;
		
		// 입력
		n = scan.nextInt();
		fibonacci = new long[n + 1];
		
		// 알고리즘
		for(int i = 0; i < fibonacci.length; i++) {
			if(i == 0) {
				fibonacci[i] = 0;
			}
			else if(i == 1) {
				fibonacci[i] = 1;
			}
			else {
				fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];	
			}
		}
		
		// 출력
		System.out.println(fibonacci[n]);
		
		scan.close();
	}
}
