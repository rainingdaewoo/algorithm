package 알고리즘_2024.인프런.string;

import java.util.Scanner;

public class 특정_문자_뒤집기 {

    public static String solution(String str) {
       StringBuilder stringBuilder = new StringBuilder();
       int lt = 0;
       int rt = str.length() - 1;
       char[] charArray = str.toCharArray();
       while( lt < rt ) {
           if(!Character.isAlphabetic(charArray[lt])) {
               lt++;
           } else if(!Character.isAlphabetic(charArray[rt])) {
               rt--;
           }else{
               char tmp = charArray[lt];
               charArray[lt] = charArray[rt];
               charArray[rt] = tmp;
               lt++;
               rt--;
           }

       }

        return String.valueOf(charArray);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println( solution(str) );
    }
}
