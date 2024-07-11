package 알고리즘_2024.인프런.HashMap_TreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 학급_회장 {
    public static char solution(int N, String str) {
        Map<Character, Integer> map = new HashMap<>();
        char answer = 'A';
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1 ) ;
        }

        int max = Integer.MIN_VALUE;
        for (Character c : map.keySet()) {
            if(map.get(c) > max) {
                answer = c;
                max = map.get(c);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String str = sc.next();

        System.out.print(solution(N, str));
    }
}

