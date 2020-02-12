package basic1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No1026 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, s;
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		// �Է�
		n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			a.add(scan.nextInt());
		}
		for(int i = 0; i < n; i++) {
			b.add(scan.nextInt());
		}
		
		// ����
		Collections.sort(a);
		Collections.sort(b, Collections.reverseOrder());
		
		// ���
		s = 0;
		for(int i = 0; i < n; i++) {
			s += (a.get(i) * b.get(i));
		}
		System.out.println(s);
		
		scan.close();
	}
}
