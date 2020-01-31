package basic1;

import java.util.Scanner;

public class No1157 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		int[] arr = new int[26];
		int max = -1;
		char result = '?';
		
		while(true) {
			str = scan.nextLine();
			if(str.length() <= 1000000) {
				break;
			}
		}
		
		for(int i = 0; i < str.length(); i++) {
			int index = Character.toLowerCase(str.charAt(i)) - 'a';
			arr[index]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				result = (char)(i + 65);
			}
			else if(arr[i] == max) {
				result = '?';
			}
		}
		
		System.out.println(result);
		
		scan.close();
	}
}
