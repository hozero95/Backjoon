package basic1;

import java.util.Scanner;

public class No1110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, count, newNum;
		String nStr, answer;
		
		while(true) {
			n = scan.nextInt();
			if(n >= 0 && n <= 99) {
				break;
			}
		}
		if(n < 10) {
			nStr = "0" + n;
		}
		else {
			nStr = "" + n;	
		}
		answer = nStr;
		
		count = 0;
		while(true) {
			String newStr = "";
			String[] strArr = nStr.split("");
			newNum = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]);
			if(newNum >= 10) {
				newStr = ("" + newNum).split("")[1];
			}
			else {
				newStr = "" + newNum;
			}
			nStr = strArr[1] + newStr;
			count++;
			if(nStr.equals(answer)) {
				break;
			}
		}
		
		System.out.println(count);
		
		scan.close();
	}
}
