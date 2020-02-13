package basic1;

import java.util.Scanner;

public class No11721 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		
		// 입력
		str = scan.next();
		
		// 출력
		for(int i = 0; i < str.length(); i += 10) {
			if(i + 10 > str.length()) {
				System.out.println(str.substring(i, str.length()));
			}
			else {
				System.out.println(str.substring(i, i + 10));	
			}
		}
		
		scan.close();
	}
}
