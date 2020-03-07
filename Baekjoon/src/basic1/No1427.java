package basic1;

import java.util.Scanner;

public class No1427 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		String[] nArr = n.split("");
		int[] arr = new int[nArr.length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(nArr[i]);
		}
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		scan.close();
	}
}
