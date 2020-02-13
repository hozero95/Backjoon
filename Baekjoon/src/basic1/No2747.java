package basic1;

import java.util.Scanner;

public class No2747 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int[] fibonacci;
		
		// �Է�
		n = scan.nextInt();
		fibonacci = new int[n + 1];
		
		// �˰���
		for(int i = 0; i < fibonacci.length; i++) {
			if(i == 0) {
				fibonacci[i] = 0;
			}
			else if(i == 1) {
				fibonacci[i] = 1;
			}
			else {
				fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];	
			}
		}
		
		// ���
		System.out.println(fibonacci[n]);
		
		scan.close();
	}
}
