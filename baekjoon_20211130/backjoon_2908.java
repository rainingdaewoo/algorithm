package baekjoon_20211130;

import java.util.Scanner;
import java.util.StringTokenizer;

public class backjoon_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		String S1 = sc.next();
		String S2 = sc.next();
		
		StringBuffer sb = new StringBuffer(S1); 
		String reversedStr1 = sb.reverse().toString();

		StringBuffer sb2 = new StringBuffer(S2); 
		String reversedStr2 = sb2.reverse().toString();
		
		if(Integer.parseInt(reversedStr1) > Integer.parseInt(reversedStr2) ) {
			System.out.println(reversedStr1);
		} else {
			System.out.println(reversedStr2);
		}
		
		
		// 숫자 2개를 문자열로 받음
		// S1과 S2를 거꾸로 바꿈.
		// 거꾸로 바꾼 S1과 S2를 비교 후 큰 수를 출력
		
	}

}
