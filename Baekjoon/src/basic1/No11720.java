package basic1;

import java.util.Scanner;

public class No11720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, sum;
		String num;
		
		// �Է�
		n = scan.nextInt();
		num = scan.next();
		sum = 0;
		for(int i = 0; i < n; i++) {
			sum += Integer.parseInt(num.substring(i, i + 1));
		}
		
		// ���
		System.out.println(sum);
		
		scan.close();
	}
}
