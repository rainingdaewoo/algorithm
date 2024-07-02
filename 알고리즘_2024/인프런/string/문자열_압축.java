package 알고리즘_2024.인프런.string;

import java.util.Scanner;

public class 문자열_압축 {

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        String answer = " ";
        int dup = 1;
        for(int i = 0; i < str.length(); i++) {
            if( answer.charAt(answer.length() - 1) == str.charAt(i)) {
                dup++;
                if(i == str.length() - 1 && dup != 1) {
                    sb.append(dup);
                }
            } else {
                if(dup != 1) {
                    sb.append(dup);
                }
                answer += str.charAt(i);
                sb.append(str.charAt(i));
                dup = 1;
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
