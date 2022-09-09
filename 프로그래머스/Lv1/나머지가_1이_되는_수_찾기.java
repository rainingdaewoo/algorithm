package 프로그래머스.Lv1;

public class 나머지가_1이_되는_수_찾기 {
    class Solution {
        public int solution(int n) {
            int answer = n;
            for(int i = n - 1; i > 0; i--) {
                if( n % i == 1 && i < answer) {
                    answer = i;
                }
            }
            return answer;
        }
    }
}
