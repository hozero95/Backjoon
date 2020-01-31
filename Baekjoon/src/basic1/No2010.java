package basic1;

import java.util.Scanner;

public class No2010 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, max;
		int[] nArr;
		
		max = 0;
		
		while(true) {
			n = scan.nextInt();
			if(n >= 1 && n <= 500000) {
				break;
			}
		}
		nArr = new int[n];
		
		for(int i = 0; i < nArr.length; i++) {
			nArr[i] = scan.nextInt();
			if(nArr[i] > 1000) {
				i--;
				continue;
			}
			if(i == nArr.length - 1) {
				max += nArr[i];
			}
			else {
				max += nArr[i] - 1;
			}
		}
		
		System.out.println(max);
		
		scan.close();
	}
}
