package basic1;

import java.util.Scanner;

public class No14720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, max;
		int[] milk;
		
		max = 0;
		
		while(true) {
			n = scan.nextInt();
			if(n >= 1 && n <= 1000) {
				break;
			}
		}
		milk = new int[n];
		
		for(int i = 0; i < milk.length; i++) {
			if(i == 0) {
				milk[i] = 0;
			}
			else {
				if(milk[i - 1] == 0) {
					milk[i] = 1;
				}
				else if(milk[i - 1] == 1) {
					milk[i] = 2;
				}
				else if(milk[i - 1] == 2) {
					milk[i] = 0;
				}
			}
			max++;
		}
		
		System.out.println(max);
		
		scan.close();
	}
}
