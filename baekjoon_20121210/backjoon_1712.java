package baekjoon_20121210;

import java.util.Scanner;

public class backjoon_1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int A = sc.nextInt(); // �������
		int B = sc.nextInt(); // ���� ���
		int C = sc.nextInt(); // ��ǰ ����
		int BEP = 1; // ��ǰ ���� �� ���ͺб���
		
		if(B >= C) {
			BEP = -1;
		} else{
			BEP = A/(C-B) + 1;
		}
		
		System.out.println(BEP);	
		
		
		
		
	}

}
