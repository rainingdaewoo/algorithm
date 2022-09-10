package 인프런;

import java.util.Scanner;

public class 단어_뒤집기 {
    public static String[] solution(String[] strings) {
        String[] answer = new String[strings.length];
        for(int i = 0; i < strings.length; i++) {
            StringBuilder sb = new StringBuilder(strings[i]);
            answer[i] = sb.reverse().toString();
            System.out.println(answer[i]);
        }
        return null;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] strings = new String[N];
        for(int i = 0; i < N; i++) {
            strings[i] = sc.next();
        }

        solution(strings);

    }
}
