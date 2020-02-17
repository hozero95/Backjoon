package basic1;

import java.util.Scanner;

public class No4344 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c, n, sum, overAvg;
		int[] score;
		double avg;
		
		c = scan.nextInt();
		for(int i = 0; i < c; i++) {
			n = scan.nextInt();
			score = new int[n];
			sum = 0;
			for(int j = 0; j < score.length; j++) {
				score[j] = scan.nextInt();
				sum += score[j];
			}
			avg = (double)sum / n;
			overAvg = 0;
			for(int j = 0; j < score.length; j++) {
				if(score[j] > avg) {
					overAvg++;
				}
			}
			System.out.println(String.format("%.3f", 100.0 * overAvg / n) + "%");
		}
		
		scan.close();
	}
}
