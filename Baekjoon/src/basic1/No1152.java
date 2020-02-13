package basic1;

import java.util.Scanner;

public class No1152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		
		// 입력
		str = scan.nextLine().trim();
		
		// 출력
		if(str.isEmpty()) {
			System.out.println(0);
		}
		else {
			System.out.println(str.split(" ").length);	
		}
		
		scan.close();
	}
}
