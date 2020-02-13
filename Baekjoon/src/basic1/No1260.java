package basic1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No1260 {
	static int n, m, v;
	static boolean[][] map;
	static boolean[] check;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ÀÔ·Â
		n = scan.nextInt();
		m = scan.nextInt();
		v = scan.nextInt();
		map = new boolean[n + 1][n + 1];
		check = new boolean[n + 1];
		for(int i = 0; i < m; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			map[x][y] = map[y][x] = true;
		}
		
		// Ãâ·Â
		dfs(v);
		check = new boolean[n + 1];
		System.out.println("");
		bfs();
		
		scan.close();
	}
	
	// ±íÀÌ ¿ì¼± Å½»ö
	public static void dfs(int v) {
		check[v] = true;
		System.out.print(v + " ");
		for(int i = 1; i <= n; i++) {
			if(map[v][i] && !check[i]) {
				dfs(i);
			}
		}
	}
	
	// ³ÐÀÌ ¿ì¼± Å½»ö
	public static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(v);
		check[v] = true;
		System.out.print(v + " ");
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			for(int i = 1; i <= n; i++) {
				if(map[temp][i] && !check[i]) {
					queue.offer(i);
					check[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}
}
