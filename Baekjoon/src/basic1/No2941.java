package basic1;

import java.util.Scanner;

public class No2941 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] alpa = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String word;
		
		// 입력
		word = scan.next();
		
		// 문자열 치환
		for(int i = 0; i < alpa.length; i++) {
			if(word.contains(alpa[i])) {
				word = word.replaceAll(alpa[i], "?");
			}
		}
		
		// 출력
		System.out.println(word.length());
		
		scan.close();
	}
}
