package basic1;

import java.util.Scanner;

public class No1292 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, flag, input, result;
		int[] num;
		
		// 입력
		a = scan.nextInt();
		b = scan.nextInt();
		num = new int[b];
		
		// 알고리즘
		flag = 1;
		input = 1;
		for(int i = 0; i < b; i++) {
			num[i] = input;
			if(flag == input) {
				flag = 0;
				input++;
			}
			flag++;
		}
		result = 0;
		for(int i = a - 1; i < b; i++) {
			result += num[i];
		}
		
		// 출력
		System.out.println(result);
		
		scan.close();
	}
}
