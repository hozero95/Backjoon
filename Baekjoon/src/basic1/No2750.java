package basic1;

import java.util.Arrays;
import java.util.Scanner;

public class No2750 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int[] arr;
		
		// �Է�
		n = scan.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		// ����
		Arrays.sort(arr);
		
		// ���
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
		scan.close();
	}
}
