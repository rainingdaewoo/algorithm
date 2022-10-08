package 프로그래머스.Lv2;

import java.util.Arrays;

public class 최솟값만들기 {

    class Solution
    {
        // 두 배열의 index 값 추출 후 곲함
        // 곱한 값을 answer에 누적
        public int solution(int []A, int []B)
        {
            int answer = 0;
            Arrays.sort(A);
            Arrays.sort(B);
            int j = A.length - 1;
            for(int i = 0; i < A.length; i++) {
                answer += A[i] * B[j--];
            }

            return answer;
        }
    }
}
