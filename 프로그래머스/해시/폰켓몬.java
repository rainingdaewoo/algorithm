package 프로그래머스.해시;

import java.util.HashMap;

class Solution2 {
    // 1. 배열 nums을 hashMap으로 변환
    // 2. Key 종류를 count
    // 3. 만약 key 종류가 nums.length / 2 보다 크면 -> nums.length / 2 반환
    // 3 - 1. 만약 key 종류가 nums.length / 2 보다 작으면 -> key 종류

    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        // 1. 배열 nums을 hashMap으로 변환
        for(int type: nums) {
            map.put(type, map.getOrDefault(type, 1) + 1);
        }

        // 2. Key 종류를 count
        map.size();
        if(map.size() >=  nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = map.size();
        }
        return answer;
    }

    public static void main(String[] args){
        int[] nums ={3,3,3,2,2,2};
        Solution2 sol = new Solution2();
        System.out.println(sol.solution(nums));
    }
}
