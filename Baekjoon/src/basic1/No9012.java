package basic1;

import java.util.Scanner;
import java.util.Stack;

public class No9012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		int t = scan.nextInt();
		boolean check;
		scan.nextLine();
		
		for(int i = 0; i < t; i++) {
			String vps = scan.nextLine();
			String[] vpsArr = vps.split("");
			check = false;
			for(int j = 0; j < vpsArr.length; j++) {
				if(vpsArr[j].equals("(")) {
					stack.push(vpsArr[j]);
				}
				else if(vpsArr[j].equals(")")) {
					if(stack.isEmpty()) {
						check = true;
						break;
					}
					else {
						stack.pop();	
					}
				}
			}
			if(!stack.isEmpty() || check) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
			stack.empty();
		}
		
		scan.close();
	}
}
