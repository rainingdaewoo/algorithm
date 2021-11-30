package baekjoon_20211130;

import java.util.Scanner;

public class backjoon_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		String abc = "abcdefghijklmnopqrstuvwxyz";
					
		String exam = sc.next();
		int[] result = new int[abc.length()];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = -1; // -1로 초기화
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
		//문자열 S를 입력받음
		// exam을 abc에 비교
		// exam에서 같은 문자가 있으면 뒤에 나오는 문자를 숫자 1로 변경
		// 문자열에 포함되어 있으면 첫 번째 등장 위치를 출력
		// 문자열에 포함되어 있지 않으면 -1
	}

}
