package basic1;

import java.util.Scanner;

public class No9095 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t;
		int[] numSet = new int[10];
		
		// 입력
		t = scan.nextInt();
		
		// 알고리즘
		numSet[0] = 1;
		numSet[1] = 2;
		numSet[2] = 4;
		for(int i = 3; i < numSet.length; i++) {
			numSet[i] = numSet[i - 1] + numSet[i - 2] + numSet[i - 3];
		}
		
		// 출력
		for(int i = 0; i < t; i++) {
			int n = scan.nextInt();
			System.out.println(numSet[n - 1]);
		}
		
		scan.close();
	}
}
