package basic1;

import java.util.Scanner;

public class No2675 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for(int i = 0; i < t; i++) {
			int r = scan.nextInt();
			String s = scan.nextLine();
			for(int j = 1; j < s.length(); j++) {
				for(int k = 0; k < r; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println("");
		}
		
		scan.close();
	}
}
