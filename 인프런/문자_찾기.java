package 인프런;

import java.util.Scanner;

public class 문자_찾기 {
    public static int solution(String str, char c) {
        int count = 0;
        String temp = str.toLowerCase();
        char lower = Character.toLowerCase(c);
        for(int i = 0; i < str.length(); i++) {
            if(lower == temp.charAt(i)) {
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
