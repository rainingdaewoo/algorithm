package 프로그래머스.Lv2;

public class 피보나치_수 {
    //https://mozzioi.tistory.com/147
    class Solution {
        public int solution(int n) {
            int answer = 0;
            // STEP 1. 결과값을 담을 배열 선언
            int[] arr = new int[n + 1];

            for(int i = 0; i <= n; i++) {
                if(i <= 1) {
                    arr[i] = i;
                }else {
                    arr[i] = (arr[i - 2] + arr[i - 1]) % 1234567;
                    // answer[i] = sum
                }
            }


            answer = arr[n];
            if( answer < 1234567) {
                return answer;
            } else {
                answer = answer % 1234567;
            }
            return answer;
        }
    }
}
