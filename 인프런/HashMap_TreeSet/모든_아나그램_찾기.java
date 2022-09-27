package 인프런.HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 모든_아나그램_찾기 {
    public static int solution(String S, String T) {
        int answer = 0;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(char x : T.toCharArray()) {
            tMap.put(x, tMap.getOrDefault(x, 0) + 1);
        }

        int L = T.length() - 1;

        for(int i = 0; i < L; i++) {
            sMap.put(S.charAt(i), sMap.getOrDefault(S.charAt(i), 0) + 1);
        }

        int lt = 0;
        for(int rt = L; rt < S.length(); rt++) {
            sMap.put(S.charAt(rt), sMap.getOrDefault(S.charAt(rt), 0) + 1);
            if(sMap.equals(tMap)) {
                answer++;
            }
            sMap.put(S.charAt(lt), sMap.get(S.charAt(lt)) - 1);
            if(sMap.get(S.charAt(lt)) == 0) {
                sMap.remove(S.charAt(lt));
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