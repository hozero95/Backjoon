package basic1;

public class No4673 {
	public static void main(String[] args) {
		boolean[] isSelfNum = new boolean[10000];
		int selfNum, check;

		// 알고리즘
		for (int i = 0; i < isSelfNum.length; i++) {
			selfNum = i + 1;
			check = selfNum;
			while (selfNum > 0) {
				check += selfNum % 10;
				selfNum /= 10;
			}
			if (check <= 10000) {
				isSelfNum[check - 1] = true;
			}
		}

		// 출력
		for (int i = 0; i < isSelfNum.length; i++) {
			if(!isSelfNum[i]) {
				System.out.println(i + 1);
			}
		}
	}
}
