package 프로그래머스.Lv1;
import java.util.*;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int temp = 0;
        Arrays.sort(d);
        for(int i : d) {
            temp += i;
            if(temp > budget) {
                break;
            }
            answer++;
        }

        return answer;
    }
}
