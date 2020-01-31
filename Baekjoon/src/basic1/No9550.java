package basic1;

import java.util.Scanner;

public class No9550 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t, n, k;
		int[] nArr, max;
		
		while(true) {
			t = scan.nextInt();
			if(t >= 1 && t <= 100) {
				break;
			}
		}
		max = new int[t];
		
		for(int i = 0; i < t; i++) {
			while(true) {
				n = scan.nextInt();
				k = scan.nextInt();
				if(n >= 1 && n <= 100 && k >= 1 && k <= 100) {
					break;
				}
			}
			
			nArr = new int[n];
			for(int j = 0; j < n; j++) {
				nArr[j] = scan.nextInt();
				if(!(nArr[j] >= 1 && nArr[j] <= 100)) {
					j--;
				}
			}
			
			for(int j = 0; j < n; j++) {
				max[i] += (nArr[j] / k);
			}
		}
		
		for(int i = 0; i < t; i++) {
			System.out.println(max[i]);
		}
		
		scan.close();
	}
}
