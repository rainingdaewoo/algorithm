package 알고리즘_2024.인프런.HashMap_TreeSet;

import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;

public class 아나그램 {
    public static String solution(String str1, String str2) {
        Map<Character, Integer> map1 = new TreeMap<>();
        Map<Character, Integer> map2 = new TreeMap<>();
        String answer = "YES";

        for (int i = 0; i < str1.length(); i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
        }
        for (Character c : map2.keySet()) {
            Integer c1 = map1.get(c);
            Integer c2 = map2.get(c);
            if(!Objects.equals(c1, c2)) return "NO";
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

