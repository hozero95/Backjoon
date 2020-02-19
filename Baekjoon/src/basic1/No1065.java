package basic1;

import java.util.Scanner;

public class No1065 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, result;

		// �Է�
		n = scan.nextInt();

		// �˰���
		if (n >= 100) {
			result = 99;
			for (int i = 100; i <= n; i++) {
				int n1 = i / 100;
				int n2 = i / 10 % 10;
				int n3 = i % 10;
				if(n2 * 2 == n1 + n3) {
					result++;
				}
			}
		} else {
			result = n;
		}
		
		// ���
		System.out.println(result);
		
		scan.close();
	}
}
