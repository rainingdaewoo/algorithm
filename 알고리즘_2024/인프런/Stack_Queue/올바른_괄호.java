package 알고리즘_2024.인프런.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class 올바른_괄호 {

    private static String solution(String str) {
        String answer = "YES";
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if( ch == '(') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()) {
            return "YES";
        }


        return answer;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
