package basic1;

import java.util.Scanner;

public class No10809 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		int[] count = new int[26];
		
		// 입력
		s = scan.next();
		
		// 알고리즘
		for(int i = 0; i < s.length(); i++) {
			int ascii = (int)s.charAt(i);
			if(count[ascii - 97] == 0) {
				count[ascii - 97] = i + 1;
			}
		}
		
		// 출력
		for(int i = 0; i < count.length; i++) {
			if(count[i] == 0) {
				System.out.print(-1 + " ");
			}
			else {
				System.out.print((count[i] - 1) + " ");
			}
		}
		
		scan.close();
	}
}
