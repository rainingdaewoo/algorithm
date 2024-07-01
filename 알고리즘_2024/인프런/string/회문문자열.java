package 알고리즘_2024.인프런.string;

import java.util.Scanner;

public class 회문문자열 {

    public static String solution(String str) {
        str = str.toUpperCase();
        String answer = "NO";

        int lt = 0;
        int rt = str.length() - 1;

        if(str.charAt(lt) != str.charAt(rt) ) {
            return answer;
        }
        while(lt > rt) {
            if(str.charAt(lt) != str.charAt(rt) ) {
                return answer;
            }
            lt++;
            rt--;
        }
        answer = "YES";
        return answer;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println( solution(str) );
    }
}
