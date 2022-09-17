package 인프런.String;

import java.util.Scanner;

public class 문자거리 {
    // 다시 풀기
    public static int[] solution(String str, char ch) {
        int[] answer = new int[str.length()];
        int length = 101;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                length = 0;
                answer[i] = length;
            } else {
                length++;
                answer[i] = length;
            }
        }
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == ch) {
                length = 0;
            } else {
                length++;
                answer[i] = Math.min(answer[i], length);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        for(int i : solution(str, ch)) {
            System.out.print(i + " ");
        }

    }
}
