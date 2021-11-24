package baekjoon_20211124;

import java.util.Scanner;

public class baekjoon_10950 {
	    public static void main(String[] args) {
	        // 반복문을 몇 번 수행할 지 정할 변수 선언
	        Scanner sc = new Scanner(System.in);        
	        int a;
	        a = sc.nextInt();
	        
	        // 결과 값을 출력해줄 변수 선언
	        int b;
	        int c;        
	        
	        // 반복문 실행
	        for(int i = 0; i < a; i++)
	        {
	            b = sc.nextInt();
	            c = sc.nextInt();
	            System.out.println(b + c);
	        }
	    }

}

