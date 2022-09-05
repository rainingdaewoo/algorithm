package 프로그래머스.해시;

import java.util.HashMap;
import java.util.Iterator;

class Solution {
    // 1. 해시 맵을 만든다. -> participant
    // 2. 만든 해시 맵에서 completion을 뺀다.
    // 3. value가 0이 아닌 마지막 주자를 찾는다.

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        // 1. 해시 맵을 만든다. -> participant
        for(String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 2. 만든 해시 맵에서 완주한 사람을 뺀다.
        for(String name : completion) {
            map.put(name, map.get(name) - 1);
        }

        // 3. value가 0이 아닌 마지막 주자를 찾는다.
        for(String key : map.keySet()) {
            if(map.get(key) != 0 ) {
                answer = key;
                break;
            }
        }
        System.out.println(map.keySet());
        return answer;
    }


    public static void main(String[] args){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        Solution sol = new Solution();
        System.out.println(sol.solution(part, comp));
    }
}


