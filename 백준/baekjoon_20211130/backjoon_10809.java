package 백준.baekjoon_20211130;

import java.util.Scanner;

public class backjoon_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		String abc = "abcdefghijklmnopqrstuvwxyz";
					
		String exam = sc.next();
		int[] result = new int[abc.length()];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = -1; // -1�� �ʱ�ȭ
		}
		
		
		for(int i = 0; i < exam.length(); i++) {
			for(int j = 0; j < exam.length(); j++) {
				if(exam.charAt(i)== exam.charAt(j)) {
					exam.replace(exam.charAt(j), '1');
				}
			}
		}
		
		for(int i = 0; i < exam.length(); i++) {
			for(int j = 0; j < abc.length(); j++) {
				if(exam.charAt(i) == abc.charAt(j)) {
					if(result[j] == -1) {
						result[j] = i;
					}
				}
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		//���ڿ� S�� �Է¹���
		// exam�� abc�� ��
		// exam���� ���� ���ڰ� ������ �ڿ� ������ ���ڸ� ���� 1�� ����
		// ���ڿ��� ���ԵǾ� ������ ù ��° ���� ��ġ�� ���
		// ���ڿ��� ���ԵǾ� ���� ������ -1
	}

}
