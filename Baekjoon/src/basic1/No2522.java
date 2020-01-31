package basic1;

import java.util.Scanner;

public class No2522 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		while(true) {
			n = scan.nextInt();
			if(n >= 0 && n <= 100) {
				break;
			}
		}
		
		for(int i = 0; i < ((2 * n) - 1); i++) {
			if(i < n) {
				for(int j = i; j < n - 1; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j = n; j <= i; j++) {
					System.out.print(" ");
				}
				for(int j = i - n; j < n - 1; j++) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		scan.close();
	}
}
