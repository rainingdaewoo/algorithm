package 알고리즘_2024.인프런.string;

import java.util.Scanner;

public class 숫자만_추출 {

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();

        str = str.replaceAll("[^0-9]", "");

        while( str.charAt(0) == '0') {
            if( str.charAt(0) == '0' ){
                str = new StringBuilder(str).delete(0, 1).toString();
            }
        }
        return str;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println( solution(str) );
    }
}
