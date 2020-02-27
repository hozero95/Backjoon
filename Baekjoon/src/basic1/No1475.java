package basic1;

import java.util.Scanner;

public class No1475 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n;
		int[] num = new int[9];
		int max;
		
		// 입력
		n = scan.next();
		n = n.replace('9', '6');
		
		// 알고리즘
		for(int i = 0; i < n.length(); i++) {
			num[(int)(n.charAt(i) - '0')]++;
		}
		num[6] = Math.round(num[6] / 2.0f);
		max = num[0];
		for(int i = 1; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		
		// 출력
		System.out.println(max);
		
		scan.close();
	}
}
