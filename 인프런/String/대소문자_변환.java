package 인프런.String;

import java.util.Scanner;

public class 대소문자_변환 {
    // 1. 입력 받은 문자열을 길이만큼 String 배열 생성
    // 2. 각 배열 값 반복문 돌림
    // 3. 만약 65 <= 값 <=94이면
    public static String solution(String str) {
        String answer = "";
        for(int i = 0; i < str.length(); i++) {
            if(65 <= str.charAt(i) && str.charAt(i) <= 90) { // 대문자일 때
                answer += Character.toLowerCase(str.charAt(i));
            } else {
                answer += Character.toUpperCase(str.charAt(i));
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println( solution(str) );
    }
}
