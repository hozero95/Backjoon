package basic1;

import java.util.Scanner;

public class No9517 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k, n, sumT;
		int[] t;
		String[] z;
		
		// �Է�
		k = scan.nextInt();
		n = scan.nextInt();
		t = new int[n];
		z = new String[n];
		for(int i = 0; i < n; i++) {
			t[i] = scan.nextInt();
			z[i] = scan.next();
		}
		
		// �˰���
		sumT = 0;
		for(int i = 0; i < n; i++) {
			sumT += t[i];
			if(sumT >= 210) {
				break;
			}
			else {
				if(z[i].equals("T")) {
					if(k == 8) {
						k = 1;
					}
					else {
						k++;
					}
				}
			}
		}
		
		// ���
		System.out.println(k);
		
		scan.close();
	}
}
