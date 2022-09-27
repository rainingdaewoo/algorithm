package 인프런.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class 후위식_연산 {
    public static int solution(String str) {
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') {
                    stack.push(lt + rt);
                } else if(x == '-') {
                    stack.push(lt - rt);
                } else if(x == '*') {
                    stack.push(lt * rt);
                } else if(x == '/') {
                    stack.push(lt / rt);
                }

            }
        }
        return stack.pop();
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}

