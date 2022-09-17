package 인프런.String;

import java.util.Scanner;

public class 문자열_압축 {

    //
    public static String solution(String str) {
        String answer = "";
        int count = 1;
        for(int i = 0; i < str.length(); i++) {
            count = 1;
            for(int j = i + 1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count != 1) {
                answer += str.charAt(i) + "" + count;
                i+= count - 1;
            } else {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(solution(str));
    }
}
