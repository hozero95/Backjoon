package basic1;

import java.util.Scanner;

public class No14724 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] group = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};
		int[][] admin;
		int n, max, main;
		
		// 입력
		n = scan.nextInt();
		admin = new int[group.length][n];
		
		// 알고리즘
		max = 0;
		main = 0;
		for(int i = 0; i < admin.length; i++) {
			for(int j = 0; j < admin[i].length; j++) {
				admin[i][j] = scan.nextInt();
				if(admin[i][j] > max) {
					max = admin[i][j];
					main = i;
				}
			}
		}
		
		// 출력
		System.out.println(group[main]);

		scan.close();
	}
}
