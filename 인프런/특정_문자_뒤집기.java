package 인프런;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 특정_문자_뒤집기 {
    public static String solution(String str) {
        String answer = "";
        int left = 0;
        int right = str.length() - 1;
        char[] chars = str.toCharArray();
        while (left < right) {
            if(!Character.isAlphabetic(chars[left])) {
                left++;
            } else if(!Character.isAlphabetic(chars[right])) {
                right--;

            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        answer = String.valueOf(chars);
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
