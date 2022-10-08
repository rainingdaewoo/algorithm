package 프로그래머스.Lv2;

public class 숫자의_표현 {

    class Solution {
        public int solution(int n) {
            int answer = 0;
            for(int i = 1; i <= n; i++) {
                int sum = 0;
                for(int j = i; j <= n; j++) {
                    sum+= j;
                    if(sum > n) break;
                    else if(sum == n) answer++;
                }
                //if(sum == n)
                // System.out.println("i:"+ i + " sum: " + sum);
            }
            return answer;
        }
    }
}
