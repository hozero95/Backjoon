package basic1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No11576 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, m, aDec;
		int[] aArr;
		
		// �Է�
		a = scan.nextInt();
		b = scan.nextInt();
		m= scan.nextInt();
		aArr = new int[m];
		for(int i = 0; i < m; i++) {
			aArr[i] = scan.nextInt();
		}
		
		// ���� ��ȯ
		aDec = a2dec(a, aArr);
		
		// ���
		dec2b(b, aDec);
		
		scan.close();
	}
	
	// a������ 10������
	public static int a2dec(int a, int[] aArr) {
		int sum = 0;
		
		for(int i = 0; i < aArr.length; i++) {
			sum += (aArr[i] * Math.pow(a, aArr.length - 1 - i));
		}
		
		return sum;
	}
	
	// 10������ b������
	public static void dec2b(int b, int aDec) {
		ArrayList<Integer> bArr = new ArrayList<Integer>();
		while(true) {
			bArr.add(aDec % b);
			aDec /= b;
			if(aDec < b) {
				bArr.add(aDec);
				break;
			}
		}
		Collections.reverse(bArr);
		for(int value : bArr) {
			System.out.print(value + " ");
		}
	}
}
