package basic1;

import java.util.Scanner;

public class No13420 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t;
		
		while(true) {
			t = scan.nextInt();
			if(t > 0) {
				break;
			}
		}
		scan.nextLine();
		
		for(int i = 0; i < t; i++) {
			String calc = scan.nextLine();
			String[] calcArr = calc.split(" ");
			long answer = 0;
			
			switch(calcArr[1]) {
			case "+":
				answer = Long.parseLong(calcArr[0]) + Long.parseLong(calcArr[2]);
				break;
			case "-":
				answer = Long.parseLong(calcArr[0]) - Long.parseLong(calcArr[2]);
				break;
			case "*":
				answer = Long.parseLong(calcArr[0]) * Long.parseLong(calcArr[2]);
				break;
			case "/":
				answer = Long.parseLong(calcArr[0]) / Long.parseLong(calcArr[2]);
				break;
			}
			
			System.out.println(answer == Long.parseLong(calcArr[4]) ? "correct" : "wrong answer");
		}
		
		scan.close();
	}
}
