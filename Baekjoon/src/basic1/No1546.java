package basic1;

import java.util.Scanner;

public class No1546 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, max, sum;
		int[] score;
		double avg;
		
		// 입력
		n = scan.nextInt();
		score = new int[n];
		sum = max = 0;
		for(int i = 0; i < n; i++) {
			score[i] = scan.nextInt();
			sum += score[i];
			max = Math.max(max, score[i]);
		}
		
		// 출력
		avg = 100.0 * sum / max / n;
		System.out.printf("%.2f", avg);
		
		scan.close();
	}
}
