package 알고리즘_2024.인프런.string;

import java.util.Scanner;

public class 문자_찾기 {
    public static int solution(String str, char c) {
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            char tmp2 = Character.toLowerCase(c);
            tmp = Character.toLowerCase(tmp);
            if(tmp == tmp2) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(solution(str, c) );
    }
}
