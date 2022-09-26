package 인프런.HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {
    // 각 str을 hashMap에 넣음
    //
    /* public static String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(char x : str1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }
        for(char x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }
        for(char x : map1.keySet()) {
            if( map1.get(x) != map2.get(x) ) {
                answer = "NO";
            }
        }
        return answer;
    } */

    public static String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char x : str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(char x: str2.toCharArray()) {
            if( !map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x) - 1 );
        }


        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        String str1 = sc.next();
        String str2 = sc.next();

        System.out.print(solution(str1, str2));
    }
}
