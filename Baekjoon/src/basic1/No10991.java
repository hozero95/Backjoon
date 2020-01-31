package basic1;

import java.util.Scanner;

public class No10991 {
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
			for(int j = 1; j <= ((i + 1) * 2) - 1; j++) {
				if(j % 2 == 0) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		scan.close();
	}
}
