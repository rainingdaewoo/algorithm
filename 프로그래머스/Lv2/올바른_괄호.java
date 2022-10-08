package 프로그래머스.Lv2;
import java.util.*;

public class 올바른_괄호 {

    boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c : arr) {
            if(c == '(') {
                stack.push(c);
            } else if(stack.isEmpty()) {
                return false;
            }else {
                stack.pop();
            }
        }

        if(!stack.isEmpty()) {
            return false;
        }
        return answer;
    }
}
