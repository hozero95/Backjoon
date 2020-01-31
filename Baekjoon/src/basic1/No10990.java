package basic1;

import java.util.Scanner;

public class No10990 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		while(true) {
			n = scan.nextInt();
			if(n >= 1 && n <= 100) {
				break;
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n - 1; j++) {
				System.out.print(" ");
			}
			if(i == 0) {
				System.out.print("*");
			}
			else {
				System.out.print("*");
				for(int j = 0; j < (i * 2 - 1); j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println("");
		}
		
		scan.close();
	}
}
