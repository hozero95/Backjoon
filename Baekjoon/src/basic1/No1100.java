package basic1;

import java.util.Scanner;

public class No1100 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] chess = new String[8];
		int result = 0;
		
		// 입력
		for(int i = 0; i < chess.length; i++) {
			chess[i] = scan.nextLine();
		}
		
		// 알고리즘
		for(int i = 0; i < chess.length; i++) {
			String[] strArr = chess[i].split("");
			if(i % 2 == 0) {
				for(int j = 0; j < strArr.length; j += 2) {
					if(strArr[j].equals("F")) {
						result++;
					}
				}
			}
			else {
				for(int j = 1; j < strArr.length; j += 2) {
					if(strArr[j].equals("F")) {
						result++;
					}
				}
			}
		}
		
		// 출력
		System.out.println(result);
		
		scan.close();
	}
}
