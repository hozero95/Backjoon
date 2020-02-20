package basic1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class No9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			Stack<String> stack = new Stack<String>();
			String str = br.readLine();
			boolean check = true;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '(') {
					stack.push(Character.toString(str.charAt(j)));
				}
				else if(str.charAt(j) == ')') {
					if(stack.isEmpty()) {
						check = false;
						break;
					}
					else {
						stack.pop();
					}
				}
			}
			if(!stack.empty()) {
				check = false;
			}
			if(check) {
				bw.write("YES");
			}
			else {
				bw.write("NO");
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
