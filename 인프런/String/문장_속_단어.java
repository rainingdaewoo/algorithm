package 인프런.String;

import java.util.Arrays;
import java.util.Scanner;

public class 문장_속_단어 {
    // 1. 매개변수를 배열로 나눔
    // 2. index 별 String 길이를 구한 후
    // 3. 2번에서 가장 값이 큰 배열을 리턴
    public static String solution(String str) {

        String[] strArr = str.split(" ");
        int max = strArr[0].length();
        int idx = 0;
        for(int i = 1; i < strArr.length; i++) {
            if( max < strArr[i].length()) {
                idx = i;
            }
        }
        String answer =strArr[idx] ;
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println( solution(str) );
    }
}
