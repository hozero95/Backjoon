package basic1;

import java.util.Scanner;

public class No2455 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] station;
		int pop, push, max;
		
		station = new int[4];
		
		for(int i = 0; i < station.length; i++) {
			pop = scan.nextInt();
			push = scan.nextInt();
			if(i == 0) {
				if(pop != 0) {
					i--;
					continue;
				}
				station[i] = push;
			}
			else {
				if(i == 3) {
					if(push != 0) {
						i--;
						continue;
					}
				}
				if(pop > station[i - 1]) {
					i--;
					continue;
				}
				station[i] = station[i - 1] - pop + push;
			}
		}
		
		max = station[0];
		for(int i = 1; i < station.length; i++) {
			if(station[i] > station[i - 1]) {
				max = station[i];
			}
		}
		
		System.out.println(max);
		
		scan.close();
	}
}
