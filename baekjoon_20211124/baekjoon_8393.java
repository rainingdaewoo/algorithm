package baekjoon_20211124;

import java.util.Scanner;

public class baekjoon_8393 {
	    public static void main(String[] args) {
	        // 반복문을 몇 번 수행할 지 정할 변수 선언
	        Scanner sc = new Scanner(System.in);        
	        int a = sc.nextInt();
	        int total = 0;
	        
	        for(int i = 1; i <= a; i++) {
	        	total += i;
	        }
	        System.out.println(total);
	    }

}

