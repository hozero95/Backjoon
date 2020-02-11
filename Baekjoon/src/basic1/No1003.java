package basic1;

import java.util.Scanner;

public class No1003 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t;
		int[] n;
		
		// 입력
		t = scan.nextInt();
		n = new int[t];
		for(int i = 0; i < n.length; i++) {
			n[i] = scan.nextInt();
			if(n[i] < 0 && n[i] > 40) {
				i--;
			}
		}
		
		// 출력
		for(int i = 0; i < n.length; i++) {
			int[][] count = new int[n[i] + 1][2];
			
			// n[i]가 0 또는 1일 때
			if(n[i] == 0) {
				System.out.println("1 0");
				continue;
			}
			if(n[i] == 1) {
				System.out.println("0 1");
				continue;
			}
			
			count[0][0] = 1;
			count[1][1] = 1;
			for(int j = 2; j <= n[i]; j++) {
				count[j][0] = count[j - 1][0] + count[j - 2][0];
				count[j][1] = count[j - 1][1] + count[j - 2][1];
			}
			
			// 출력
			System.out.println(count[n[i]][0] + " " + count[n[i]][1]);
		}
		
		scan.close();
	}
}
