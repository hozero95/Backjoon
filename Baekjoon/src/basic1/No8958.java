package basic1;

import java.util.Scanner;

public class No8958 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		int count, sum;
		int n = scan.nextInt();
		scan.nextLine();
		
		count = sum = 0;
		for(int i = 0; i < n; i++) {
			str = scan.nextLine();
			String[] strArr = str.split("");
			for(int j = 0; j < strArr.length; j++) {
				if(strArr[j].equals("O")) {
					count++;
					sum += count;
				}
				else {
					count = 0;
				}
			}
			System.out.println(sum);
			count = sum = 0;
		}
		
		scan.close();
	}
}
