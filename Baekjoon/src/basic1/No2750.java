package basic1;

import java.util.Arrays;
import java.util.Scanner;

public class No2750 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int[] arr;
		
		// 입력
		n = scan.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		// 정렬
		Arrays.sort(arr);
		
		// 출력
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
		scan.close();
	}
}
