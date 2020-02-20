package basic1;

import java.util.Scanner;

public class No2920 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[8];
		String result = "";
		
		// 입력
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		// 알고리즘
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] == (arr[i + 1] - 1)) {
				result = "ascending";
			}
			else if(arr[i] == (arr[i + 1] + 1)) {
				result = "descending";
			}
			else {
				result = "mixed";
				break;
			}
		}
		
		// 출력
		System.out.println(result);
		
		scan.close();
	}
}
