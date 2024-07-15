package 백준.baekjoon_20211130;

import java.util.Scanner;
import java.util.StringTokenizer;

public class backjoon_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		String S = sc.nextLine();
		// st �� ������ �������� ���� ��ū���� st �� �����Ѵ�
		StringTokenizer st = new StringTokenizer(S," ");
				
		// countTokens() �� ��ū�� ������ ��ȯ�Ѵ�
		System.out.println(st.countTokens());	
		
	}

}
