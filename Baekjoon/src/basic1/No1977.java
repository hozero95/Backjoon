package basic1;

import java.util.Scanner;

public class No1977 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m, n, sum, min;
		
		// �Է�
		while(true) {
			m = scan.nextInt();
			n = scan.nextInt();
			if(m <= 10000 && n <= 10000 && m <= n) {
				break;
			}
			else {
				System.out.println("�ٽ� �Է�");
			}
		}
		
		// ���������� �հ�, �ּڰ� ���ϱ�
		min = (int)Math.ceil(Math.sqrt(m));
		sum = 0;
		for(int i = min; i <= Math.floor(Math.sqrt(n)); i++) {
			sum += Math.pow(i, 2);
		}
		
		// ���
		if(sum == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum + "\n" + (int)Math.pow(min, 2));
		}
		
		scan.close();
	}
}
