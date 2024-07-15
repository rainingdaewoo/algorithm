package 백준.baekjoon_20211124;

import java.util.Scanner;

public class baekjoon_8393 {
	    public static void main(String[] args) {
	        // �ݺ����� �� �� ������ �� ���� ���� ����
	        Scanner sc = new Scanner(System.in);        
	        int a = sc.nextInt();
	        int total = 0;
	        
	        for(int i = 1; i <= a; i++) {
	        	total += i;
	        }
	        System.out.println(total);
	    }

}

