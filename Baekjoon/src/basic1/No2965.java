package basic1;

import java.util.Arrays;
import java.util.Scanner;

public class No2965 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] abc = new int[3];
		int count;
		
		// 입력
		for(int i = 0; i < abc.length; i++) {
			abc[i] = scan.nextInt();
			if(abc[i] <= 0 && abc[i] >= 100) {
				i--;
			}
		}
		
		count = 0;
		while(true) {
			Arrays.sort(abc);
			// 루프 탈출 조건
			if((abc[1] - abc[0] == 1) && (abc[2] - abc[1] == 1)) {
				break;
			}
			if((abc[1] - abc[0]) > (abc[2] - abc[1])) {
				abc[2] = abc[0] + 1;
			}
			else {
				abc[0] = abc[2] - 1;
			}
			count++;
		}
		
		// 출력
		System.out.println(count);
		
		scan.close();
	}
}
