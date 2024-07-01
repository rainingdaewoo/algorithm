package 알고리즘_2024.인프런.string;

import java.util.Scanner;

public class 단어_뒤집기 {

    public static String[] solution(String[] str) {
        String[] answer = new String[str.length];

       for(int i = 0; i < str.length; i++) {
           StringBuilder stringBuilder = new StringBuilder();

           for(int j = str[i].length() - 1; j >= 0; j--) {
               char tmp = str[i].charAt(j);
                stringBuilder.append(tmp);
           }

           answer[i] = stringBuilder.toString();
       }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] strArr = new String[N];
        for(int i = 0; i < N; i++) {
            strArr[i] = sc.next();
        }

        String[] solution = solution(strArr);

        for(int i = 0; i < solution.length; i++) {
            System.out.println( solution[i] );
        }
    }
}
