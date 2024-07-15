package 백준.baekjoon_20211130;

import java.util.Scanner;

public class backjoon_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[26];
		String S = sc.next();
		int max = -1;
		char result = ' ';
		
		for(int i = 0; i < S.length(); i++) {
			if (65 <= S.charAt(i) && S.charAt(i) <= 90) { // �빮�� ����
				arr[S.charAt(i) - 65]++;	// �ش� �ε����� �� 1 ����
			}
			else {	// �ҹ��� ����
				arr[S.charAt(i) - 97]++;
			}
		} 
		
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				result = (char)(i + 65);
			}
			else if (arr[i] == max) {
				result = '?';
			}
		}
		System.out.println(result);
		// ���ڿ� S�� �Է�
		// �Էµ� S�� ���� ���� ī��Ʈ
		// ���� �ҹ��ڸ� �빮�ڷ� ��ȯ �� ī��Ʈ
		
		// ���� ���� ī��Ʈ �� ���ĺ��� �빮�ڷ� ���
	}
}
