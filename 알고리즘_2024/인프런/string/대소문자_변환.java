package 알고리즘_2024.인프런.string;

import java.util.Scanner;

public class 대소문자_변환 {
    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();

       for(int i = 0; i < str.length(); i ++) {
           if( str.charAt(i) >= 97 ) { // 소문자 -> 대문자
               char c = str.charAt(i);
               c = Character.toUpperCase(c);
               answer.append(c);
           }
           else { // 대문자 -> 소문자
               char c = str.charAt(i);
               c = Character.toLowerCase(c);
               answer.append(c);
           }
       }

        return answer.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println( solution(str) );
    }
}
