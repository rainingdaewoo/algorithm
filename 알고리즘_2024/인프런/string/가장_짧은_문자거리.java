package 알고리즘_2024.인프런.string;

import java.util.Scanner;

public class 가장_짧은_문자거리 {
    public static int[] solution(String str, char ch) {
        int[] answer = new int[str.length()];
        int length = 1000;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ch) {
                length++;
                answer[i] = length;
            } else {
                length = 0;
                answer[i] = length;
            }
        }

        length = 1000;

        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) != ch) {
                length++;
                answer[i] = Math.min(length, answer[i]);
            } else {
                length = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);

        int[] solution = solution(str, ch);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}
