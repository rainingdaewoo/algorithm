package baekjoon_20211130;

import java.util.Scanner;

public class backjoon_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[26];
		String S = sc.next();
		int max = -1;
		char result = ' ';
		
		for(int i = 0; i < S.length(); i++) {
			if (65 <= S.charAt(i) && S.charAt(i) <= 90) { // 대문자 범위
				arr[S.charAt(i) - 65]++;	// 해당 인덱스의 값 1 증가
			}
			else {	// 소문자 범위
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
		// 문자열 S를 입력
		// 입력된 S를 글자 별로 카운트
		// 만약 소문자면 대문자로 변환 후 카운트
		
		// 제일 많이 카운트 된 알파벳을 대문자로 출력
	}
}
