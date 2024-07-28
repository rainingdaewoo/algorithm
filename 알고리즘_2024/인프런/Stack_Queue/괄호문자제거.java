package 알고리즘_2024.인프런.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 괄호문자제거 {
    private static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if( ch != ')') {
                stack.push(ch);
            } else {
                while(stack.pop() != '(') {}
            }
        }
        for(char ch : stack) {
            answer.append(ch);
        }

        return answer.reverse().toString();
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }


}
