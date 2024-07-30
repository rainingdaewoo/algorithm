package 알고리즘_2024.인프런.HashMap_TreeSet;

import java.util.*;

public class 모든_아나그램_찾기 {
    public static int solution(String S, String T) {
        int answer = 0;
        Map<Character, Integer> S_map = new HashMap<>();
        Map<Character, Integer> T_map = new HashMap<>();

        for(int i = 0; i < T.length(); i++) {
            S_map.put(S.charAt(i), S_map.getOrDefault(S.charAt(i), 0) + 1 );
            T_map.put(T.charAt(i), T_map.getOrDefault(T.charAt(i), 0) + 1 );
        }

        if(S_map.equals(T_map)) answer++;

        int lt = 0;
        for(int rt = T.length(); rt < S.length(); rt++) {
            S_map.put(S.charAt(rt), S_map.getOrDefault(S.charAt(rt), 0) + 1);
            S_map.put(S.charAt(lt), S_map.get(S.charAt(lt)) - 1);

            if(S_map.get(S.charAt(lt)) == 0) {
                S_map.remove(S.charAt(lt));
            }

            if (S_map.equals(T_map)) {
                answer++;
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();

        System.out.println(solution(S, T));
    }

}

