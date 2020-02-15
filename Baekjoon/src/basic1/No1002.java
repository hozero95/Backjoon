package basic1;

import java.util.Scanner;

public class No1002 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t, x1, y1, r1, x2, y2, r2;
		
		// 입력, 출력
		t = scan.nextInt();
		for(int i = 0; i < t; i++) {
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			r1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			r2 = scan.nextInt();
			result(x1, y1, r1, x2, y2, r2);
		}
		
		scan.close();
	}
	
	// 알고리즘
	public static void result(int x1, int y1, int r1, int x2, int y2, int r2) {
		int result;
		if(x1 == x2 && y1 == y2) {
			if(r1 == r2) {
				result = -1;
			}
			else {
				result = 0;
			}
		}
		else {
			double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			if(distance < r1 + r2) {
				result = 2;
			}
			else if(distance == r1 + r2){
				result = 1;
			}
			else {
				result = 0;
			}	
		}
		System.out.println(result);
	}
}
