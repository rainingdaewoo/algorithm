package 알고리즘_2024.인프런.string;

import java.util.Scanner;

public class 암호 {

    public static String solution(int n, String str) {
        StringBuilder sb = new StringBuilder();

        while(str.length() > 0) {
            String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
            str = str.substring(7, str.length());

            sb.append((char) Integer.parseInt(tmp, 2));
        }

        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println( solution(n, str) );
    }
}
