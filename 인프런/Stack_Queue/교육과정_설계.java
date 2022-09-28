package 인프런.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정_설계 {
    // 필수 과목(str1)을 Q에 offer
    // 실제 과목만큼 반복문을 돌림
    public static String solution(String str1, String str2) {
        String answer = "NO";
        Queue<Character> Q = new LinkedList<>();
        for(char x : str1.toCharArray()) {
            Q.offer(x);
        }

        for(int i = 0; i < str2.length(); i++) {
            if(Q.peek() == str2.charAt(i)) {
                Q.poll();
            }
            if(Q.size() == 0) {
                return "YES";
            }
        }
        if(Q.size() == 0) {
            return "YES";
        }

        return answer;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(solution(str1, str2));
    }
}