package 프로그래머스.Lv1;
import java.util.*;
public class 제일_작은_수_제거하기 {

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        if(arr.length == 1) {
            answer[0] = -1;
            return answer;
        }

        for(int i = 0; i < answer.length; i++) {
            answer[i] = arr[i];
        }

        Arrays.sort(answer);
        int min = answer[0];

        int[] removeMin = new int[answer.length - 1];
        int index = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }

            removeMin[index] = arr[i];
            index++;
        }

        return removeMin;
    }
}
