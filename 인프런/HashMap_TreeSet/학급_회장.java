package 인프런.HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 학급_회장 {
    public static char solution(int N, String ABC) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < ABC.length(); i++) {
            map.put(ABC.charAt(i), map.getOrDefault(ABC.charAt(i), 0) + 1 ) ;
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String ABC = sc.next();

        System.out.print(solution(N, ABC));
    }
}
