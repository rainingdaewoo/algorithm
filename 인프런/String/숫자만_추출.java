package 인프런.String;

import java.util.Scanner;

public class 숫자만_추출 {

    public static int solution(String str) {
        int answer;
        String temp = "";
        for(int i = 0; i < str.length(); i++) {
            if( 48 <= str.charAt(i) && str.charAt(i) <=57) {
                temp += str.charAt(i);
            }
        }

        answer = Integer.parseInt(temp);
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
