package basic1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No11576 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, m, aDec;
		int[] aArr;
		
		// 입력
		a = scan.nextInt();
		b = scan.nextInt();
		m= scan.nextInt();
		aArr = new int[m];
		for(int i = 0; i < m; i++) {
			aArr[i] = scan.nextInt();
		}
		
		// 진법 변환
		aDec = a2dec(a, aArr);
		
		// 출력
		dec2b(b, aDec);
		
		scan.close();
	}
	
	// a진수를 10진수로
	public static int a2dec(int a, int[] aArr) {
		int sum = 0;
		
		for(int i = 0; i < aArr.length; i++) {
			sum += (aArr[i] * Math.pow(a, aArr.length - 1 - i));
		}
		
		return sum;
	}
	
	// 10진수를 b진수로
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
