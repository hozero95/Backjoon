package basic1;

import java.util.Scanner;

public class No10951 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		while(scan.hasNextInt()) {
			a = scan.nextInt();
			b = scan.nextInt();
			if(!(a > 0 && a < 10 && b > 0 && b < 10)) {
				continue;
			}
			System.out.println(a + b);
		}
		
		scan.close();
	}
}
