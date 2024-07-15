package 백준.baekjoon_20211124;

import java.util.Scanner;

public class baekjoon_10950 {
	    public static void main(String[] args) {
	        // �ݺ����� �� �� ������ �� ���� ���� ����
	        Scanner sc = new Scanner(System.in);        
	        int a;
	        a = sc.nextInt();
	        
	        // ��� ���� ������� ���� ����
	        int b;
	        int c;        
	        
	        // �ݺ��� ����
	        for(int i = 0; i < a; i++)
	        {
	            b = sc.nextInt();
	            c = sc.nextInt();
	            System.out.println(b + c);
	        }
	    }

}

