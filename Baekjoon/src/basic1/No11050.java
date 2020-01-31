package basic1;

import java.util.Scanner;

public class No11050 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, k, result;
		
		while(true) {
			n = scan.nextInt();
			k = scan.nextInt();
			if(n >= 1 && n <= 10 && k >= 0 && k <= n) {
				break;
			}
		}
		
		result = factorial(n) / (factorial(k) * factorial(n - k));
		System.out.println(result);
		
		scan.close();
	}
	
	static int factorial(int num) {
		int result = 1;
		
		for(int i = num; i > 0; i--) {
			result *= i;
		}
		
		return result;
	}
}
