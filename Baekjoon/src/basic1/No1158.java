package basic1;

import java.util.ArrayList;
import java.util.Scanner;

public class No1158 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, k, temp;
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();

		// �Է�
		n = scan.nextInt();
		k = scan.nextInt();
		for(int i = 0; i < n; i++) {
			arr.add(i + 1);
		}

		// �˰���
		temp = 0;
		while(!arr.isEmpty()) {
			temp = (temp + k - 1) % arr.size();
			result.add(arr.remove(temp));
		}

		// ���
		System.out.print("<");
		for (int i = 0; i < n; i++) {
			System.out.print(result.get(i));
			if (i != (n - 1)) {
				System.out.print(", ");
			}
		}
		System.out.print(">");

		scan.close();
	}
}
