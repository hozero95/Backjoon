package basic1;

import java.util.Scanner;

public class No10872 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int result = 1;
		
		// �Է�
		n = scan.nextInt();
		
		// �˰���
		for(int i = n; i >= 1; i--) {
			result *= i;
		}
		
		// ���
		System.out.println(result);
		
		scan.close();
	}
}
