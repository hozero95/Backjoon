package basic1;

import java.util.Scanner;

public class No1100 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] chess = new String[8];
		int result = 0;
		
		// �Է�
		for(int i = 0; i < chess.length; i++) {
			chess[i] = scan.nextLine();
		}
		
		// �˰���
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
		
		// ���
		System.out.println(result);
		
		scan.close();
	}
}
