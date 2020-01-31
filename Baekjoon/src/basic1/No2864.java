package basic1;

import java.util.Scanner;

public class No2864 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, aLength, bLength, copyA, copyB, temp, newA, newB, line, min, max;
		newA = 0;
		newB = 0;
		line = 1;
		
		a = scan.nextInt();
		b = scan.nextInt();
		aLength = (int)(Math.log10(a) + 1);
		bLength = (int)(Math.log10(b) + 1);
		copyA = a;
		copyB = b;
		
		// min
		for(int i = 0; i < aLength; i++) {
			temp = copyA % 10;
			if(temp == 6) {
				temp = 5;
			}
			newA += temp * line;
			line *= 10;
			copyA /= 10;
		}
		line = 1;
		for(int i = 0; i < bLength; i++) {
			temp = copyB % 10;
			if(temp == 6) {
				temp = 5;
			}
			newB += temp * line;
			line *= 10;
			copyB /= 10;
		}
		min = newA + newB;
		
		newA = 0;
		newB = 0;
		copyA = a;
		copyB = b;
		line = 1;
		// max
		for(int i = 0; i < aLength; i++) {
			temp = copyA % 10;
			if(temp == 5) {
				temp = 6;
			}
			newA += temp * line;
			line *= 10;
			copyA /= 10;
		}
		line = 1;
		for(int i = 0; i < bLength; i++) {
			temp = copyB % 10;
			if(temp == 5) {
				temp = 6;
			}
			newB += temp * line;
			line *= 10;
			copyB /= 10;
		}
		max = newA + newB;
		
		System.out.println(min + " " + max);
		
		scan.close();
	}
}
