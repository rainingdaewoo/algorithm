package 프로그래머스.Lv1;
import java.util.*;

public class 나누어_떨어지는_숫자_배열 {
    // 1. 반복문을 돌려 divisor으로 나누어 떨어지는 수를 구함.
    // 2. 길이가 (arr.length - 1번 수)인 배열을 구함.
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] % divisor == 0) {
                cnt++;
            }
        }
        if(cnt == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[cnt];
        int index = 0;
        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] % divisor == 0) {
                answer[index++] = arr[i];
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
