package 인프런;

import java.util.Scanner;

public class 회문_문자열 {
    public static String solution(String str) {
        String answer = "NO";
        String sample = str.toLowerCase();
        int leftIdx = 0;
        int rightIdx = str.length() - 1;
        String left = "";
        String right = "";
        while(leftIdx < rightIdx) {
            left += sample.charAt(leftIdx);
            right += sample.charAt(rightIdx);
            leftIdx++;
            rightIdx--;
        }
        if(left.equals(right)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
