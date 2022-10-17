package 프로그래머스.Lv2;
import java.util.*;

public class 짝지어_제거하기 {

    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if( !stack.isEmpty() && stack.peek() == ch) stack.pop();
            else stack.push(ch);
        }


        return stack.isEmpty() ? 1 : 0;
    }
}
