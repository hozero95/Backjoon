package basic1;

import java.util.Scanner;

public class No11403 {
	static int n;
	static int[][] arr;
	static int[][] result;
	static int[] check;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �Է�
		n = scan.nextInt();
		arr = new int[n + 1][n + 1];
		result = new int[n + 1][n + 1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		// �˰���
		for(int i = 1; i <= n; i++) {
			check = new int[n + 1];
			dfs(i, true);
			result[i] = check;
		}
		
		// ���
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println("");
		}
		
		scan.close();
	}
	
	// ���� �켱 Ž��
	public static void dfs(int v, boolean isFirst) {
		if(!isFirst) {
			check[v] = 1;
		}
		for(int i = 1; i <= n; i++) {
			if(arr[v][i] == 1 && check[i] == 0) {
				dfs(i, false);
			}
		}
	}
}
