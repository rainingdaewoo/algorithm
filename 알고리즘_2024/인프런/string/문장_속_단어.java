package 알고리즘_2024.인프런.string;

import java.util.Scanner;

public class 문장_속_단어 {

    public static String solution(String str) {
        String answer = "";

        String[] strArr = str.split(" ");

        for(String tmp : strArr) {
            if(answer.equals("")) {
                answer = tmp;
            }
            if(answer.length() < tmp.length()) {
                answer = tmp;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println( solution(str) );
    }
}
