package basic1;

import java.util.Scanner;

public class No14724 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] group = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};
		int[][] admin;
		int[] groupMax = new int[group.length];
		int n, max;
		String result = null;
		
		while(true) {
			n = scan.nextInt();
			if(n >= 1 && n <= 100) {
				break;
			}
		}
		admin = new int[group.length][n];
		
		for(int i = 0; i < admin.length; i++) {
			for(int j = 0; j < admin[i].length; j++) {
				admin[i][j] = scan.nextInt();
				if(!(admin[i][j] >= 1 && admin[i][j] <= 1000)) {
					j--;
					continue;
				}
			}
		}
		
		for(int i = 0; i < admin.length; i++) {
			groupMax[i] = admin[i][0];
			for(int j = 1; j < admin[i].length; j++) {
				if(admin[i][j] > admin[i][j - 1]) {
					groupMax[i] = admin[i][j];
				}
			}
		}
		
		max = groupMax[0];
		for(int i = 1; i < groupMax.length; i++) {
			if(groupMax[i] > max) {
				max = groupMax[i];
			}
		}
		
		end:
		for(int i = 0; i < admin.length; i++) {
			for(int j = 0; j < admin[i].length; j++) {
				if(admin[i][j] == max) {
					result = group[i];
					break end;
				}
			}
		}
		
		System.out.println(result);

		scan.close();
	}
}
