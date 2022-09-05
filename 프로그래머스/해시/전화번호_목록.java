package 프로그래머스.해시;

import java.util.HashMap;

class Solution3 {
    // 1. HashMap 생성
    // 2. 번호의 접두어가 HashMap에 있는지 확인한다.
    // 3. 2번 확인 후 없으면 True 반환

    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();

        // 1. HashMap 생성
        for(String phone : phone_book) {
            map.put(phone, 1);
        }

        // 2. 번호의 접두어가 HashMap에 있는지 확인한다.
        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 1; j < phone_book[i].length(); j++) {
                if( map.containsKey(phone_book[i].substring(0, j)) ) {
                    return false;
                }
            }
        }

        // 3. 2번 확인 후 없으면 True 반환
        return true;
    }

    public static void main(String[] args){
        String[] phone_book ={"123","456","789"};
        Solution3 sol = new Solution3();
        System.out.println(sol.solution(phone_book));
    }
}
