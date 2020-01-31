package basic1;

import java.util.Scanner;

public class No14730 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, c, k, result;
		
		result = 0;
		
		while(true) {
			n = scan.nextInt();
			if(n >= 1 && n <= 100) {
				break;
			}
		}
		
		for(int i = 0; i < n; i++) {
			c = scan.nextInt();
			k = scan.nextInt();
			if(!(c >= -100 && c <= 100 && c != 0 && k >= 0 && k <= 1000)) {
				i--;
				continue;
			}
			result += (c * k);
		}
		
		System.out.println(result);
		
		scan.close();
	}
}
