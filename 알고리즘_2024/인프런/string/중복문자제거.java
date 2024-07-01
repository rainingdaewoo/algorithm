package 알고리즘_2024.인프런.string;

import java.util.Scanner;

public class 중복문자제거 {

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append( str.charAt(0) );
        for(int i = 0; i < str.length(); i++) {
            if ( sb.indexOf(String.valueOf(str.charAt(i)))  < 0 ) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println( solution(str) );
    }
}
