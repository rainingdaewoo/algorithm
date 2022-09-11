package 인프런;

import java.util.Scanner;

public class 팰린드롬 {
    public static String solution(String str) {
        String answer = "NO";
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        String reverse = new StringBuilder(str).reverse().toString();
        if( str.equals(reverse)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
