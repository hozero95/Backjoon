package basic1;

import java.util.Scanner;

public class No1152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		
		// �Է�
		str = scan.nextLine().trim();
		
		// ���
		if(str.isEmpty()) {
			System.out.println(0);
		}
		else {
			System.out.println(str.split(" ").length);	
		}
		
		scan.close();
	}
}
