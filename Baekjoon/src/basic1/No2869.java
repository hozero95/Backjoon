package basic1;

import java.util.Scanner;

public class No2869 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, v;
		
		// �Է�
		a = scan.nextInt();
		b = scan.nextInt();
		v = scan.nextInt();
		
		// ���
		System.out.println((int)Math.ceil((double)(v - a) / (a - b) + 1));
		
		scan.close();
	}
}
