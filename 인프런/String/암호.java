package 인프런.String;

import java.util.Scanner;

public class 암호 {
    public static String solution(String str, int N) {
        String answer = "";
        for(int i = 0; i < N; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            str = str.substring(7);
            answer += (char)num;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        System.out.print(solution(str, N));
    }
}
