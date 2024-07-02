package 알고리즘_2024.인프런.string;

import java.util.Scanner;

public class 유효한_팰린드롬 {

    public static String solution(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        String answer = "NO";
        if( tmp.equals(str) ) {
            answer = "YES";
        }
        return answer;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println( solution(str) );
    }
}
